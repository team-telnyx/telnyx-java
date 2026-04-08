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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TrafficPolicyProfileListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<String>,
    private val domains: JsonField<List<String>>,
    private val ipRanges: JsonField<List<String>>,
    private val limitBwKbps: JsonField<Long>,
    private val recordType: JsonField<String>,
    private val services: JsonField<List<String>>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("domains")
        @ExcludeMissing
        domains: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ip_ranges")
        @ExcludeMissing
        ipRanges: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("limit_bw_kbps")
        @ExcludeMissing
        limitBwKbps: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("services")
        @ExcludeMissing
        services: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        domains,
        ipRanges,
        limitBwKbps,
        recordType,
        services,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

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
     * Bandwidth limit in kbps.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitBwKbps(): Optional<Long> = limitBwKbps.getOptional("limit_bw_kbps")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Array of PCEF service IDs included in the profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun services(): Optional<List<String>> = services.getOptional("services")

    /**
     * The type of the traffic policy profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

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
    @JsonProperty("ip_ranges") @ExcludeMissing fun _ipRanges(): JsonField<List<String>> = ipRanges

    /**
     * Returns the raw JSON value of [limitBwKbps].
     *
     * Unlike [limitBwKbps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit_bw_kbps") @ExcludeMissing fun _limitBwKbps(): JsonField<Long> = limitBwKbps

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [services].
     *
     * Unlike [services], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("services") @ExcludeMissing fun _services(): JsonField<List<String>> = services

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

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
         * Returns a mutable builder for constructing an instance of
         * [TrafficPolicyProfileListResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TrafficPolicyProfileListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var domains: JsonField<MutableList<String>>? = null
        private var ipRanges: JsonField<MutableList<String>>? = null
        private var limitBwKbps: JsonField<Long> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var services: JsonField<MutableList<String>>? = null
        private var type: JsonField<Type> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(trafficPolicyProfileListResponse: TrafficPolicyProfileListResponse) =
            apply {
                id = trafficPolicyProfileListResponse.id
                createdAt = trafficPolicyProfileListResponse.createdAt
                domains = trafficPolicyProfileListResponse.domains.map { it.toMutableList() }
                ipRanges = trafficPolicyProfileListResponse.ipRanges.map { it.toMutableList() }
                limitBwKbps = trafficPolicyProfileListResponse.limitBwKbps
                recordType = trafficPolicyProfileListResponse.recordType
                services = trafficPolicyProfileListResponse.services.map { it.toMutableList() }
                type = trafficPolicyProfileListResponse.type
                updatedAt = trafficPolicyProfileListResponse.updatedAt
                additionalProperties =
                    trafficPolicyProfileListResponse.additionalProperties.toMutableMap()
            }

        /** Identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** ISO 8601 formatted date-time indicating when the resource was created. */
        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** Array of domain names. */
        fun domains(domains: List<String>) = domains(JsonField.of(domains))

        /**
         * Sets [Builder.domains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domains] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /** Bandwidth limit in kbps. */
        fun limitBwKbps(limitBwKbps: Long?) = limitBwKbps(JsonField.ofNullable(limitBwKbps))

        /**
         * Alias for [Builder.limitBwKbps].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limitBwKbps(limitBwKbps: Long) = limitBwKbps(limitBwKbps as Long?)

        /** Alias for calling [Builder.limitBwKbps] with `limitBwKbps.orElse(null)`. */
        fun limitBwKbps(limitBwKbps: Optional<Long>) = limitBwKbps(limitBwKbps.getOrNull())

        /**
         * Sets [Builder.limitBwKbps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitBwKbps] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun limitBwKbps(limitBwKbps: JsonField<Long>) = apply { this.limitBwKbps = limitBwKbps }

        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Array of PCEF service IDs included in the profile. */
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

        /** The type of the traffic policy profile. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** ISO 8601 formatted date-time indicating when the resource was updated. */
        fun updatedAt(updatedAt: String) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedAt(updatedAt: JsonField<String>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [TrafficPolicyProfileListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TrafficPolicyProfileListResponse =
            TrafficPolicyProfileListResponse(
                id,
                createdAt,
                (domains ?: JsonMissing.of()).map { it.toImmutable() },
                (ipRanges ?: JsonMissing.of()).map { it.toImmutable() },
                limitBwKbps,
                recordType,
                (services ?: JsonMissing.of()).map { it.toImmutable() },
                type,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TrafficPolicyProfileListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        domains()
        ipRanges()
        limitBwKbps()
        recordType()
        services()
        type().ifPresent { it.validate() }
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (domains.asKnown().getOrNull()?.size ?: 0) +
            (ipRanges.asKnown().getOrNull()?.size ?: 0) +
            (if (limitBwKbps.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (services.asKnown().getOrNull()?.size ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

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

            @JvmField val THROTTLING = of("throttling")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WHITELIST,
            BLACKLIST,
            THROTTLING,
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
            THROTTLING,
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
                THROTTLING -> Value.THROTTLING
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
                THROTTLING -> Known.THROTTLING
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrafficPolicyProfileListResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            domains == other.domains &&
            ipRanges == other.ipRanges &&
            limitBwKbps == other.limitBwKbps &&
            recordType == other.recordType &&
            services == other.services &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            domains,
            ipRanges,
            limitBwKbps,
            recordType,
            services,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrafficPolicyProfileListResponse{id=$id, createdAt=$createdAt, domains=$domains, ipRanges=$ipRanges, limitBwKbps=$limitBwKbps, recordType=$recordType, services=$services, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
