// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.ippools

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
import com.telnyx.sdk.models.email.dedicatedips.DedicatedIp
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * An account-scoped pool of dedicated IPs. Mail uses a pool only when the pool is scoped to the
 * sending domain (`domain_id`) or is the account default (`is_default`).
 */
class IpPool
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val domainId: JsonField<String>,
    private val ips: JsonField<List<Ip>>,
    private val isDefault: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val recordType: JsonField<RecordType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("domain_id") @ExcludeMissing domainId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ips") @ExcludeMissing ips: JsonField<List<Ip>> = JsonMissing.of(),
        @JsonProperty("is_default")
        @ExcludeMissing
        isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, createdAt, domainId, ips, isDefault, name, recordType, updatedAt, mutableMapOf())

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Email domain this pool is scoped to. The pool carries that domain's mail. Null when the pool
     * is not domain-scoped.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domainId(): Optional<String> = domainId.getOptional("domain_id")

    /**
     * Member IPs with their routing weights. Populated by Retrieve an IP pool; list, create, and
     * update responses return an empty array.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ips(): Optional<List<Ip>> = ips.getOptional("ips")

    /**
     * Whether this is the account's default pool. The default pool carries mail for sending domains
     * that have no domain-scoped pool. At most one per account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDefault(): Optional<Boolean> = isDefault.getOptional("is_default")

    /**
     * Pool name, unique within the account.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

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
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [domainId].
     *
     * Unlike [domainId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain_id") @ExcludeMissing fun _domainId(): JsonField<String> = domainId

    /**
     * Returns the raw JSON value of [ips].
     *
     * Unlike [ips], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ips") @ExcludeMissing fun _ips(): JsonField<List<Ip>> = ips

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [IpPool]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IpPool]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var domainId: JsonField<String> = JsonMissing.of()
        private var ips: JsonField<MutableList<Ip>>? = null
        private var isDefault: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ipPool: IpPool) = apply {
            id = ipPool.id
            createdAt = ipPool.createdAt
            domainId = ipPool.domainId
            ips = ipPool.ips.map { it.toMutableList() }
            isDefault = ipPool.isDefault
            name = ipPool.name
            recordType = ipPool.recordType
            updatedAt = ipPool.updatedAt
            additionalProperties = ipPool.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Email domain this pool is scoped to. The pool carries that domain's mail. Null when the
         * pool is not domain-scoped.
         */
        fun domainId(domainId: String?) = domainId(JsonField.ofNullable(domainId))

        /** Alias for calling [Builder.domainId] with `domainId.orElse(null)`. */
        fun domainId(domainId: Optional<String>) = domainId(domainId.getOrNull())

        /**
         * Sets [Builder.domainId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domainId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domainId(domainId: JsonField<String>) = apply { this.domainId = domainId }

        /**
         * Member IPs with their routing weights. Populated by Retrieve an IP pool; list, create,
         * and update responses return an empty array.
         */
        fun ips(ips: List<Ip>) = ips(JsonField.of(ips))

        /**
         * Sets [Builder.ips] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ips] with a well-typed `List<Ip>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ips(ips: JsonField<List<Ip>>) = apply { this.ips = ips.map { it.toMutableList() } }

        /**
         * Adds a single [Ip] to [ips].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIp(ip: Ip) = apply {
            ips = (ips ?: JsonField.of(mutableListOf())).also { checkKnown("ips", it).add(ip) }
        }

        /**
         * Whether this is the account's default pool. The default pool carries mail for sending
         * domains that have no domain-scoped pool. At most one per account.
         */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** Pool name, unique within the account. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [IpPool].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IpPool =
            IpPool(
                id,
                createdAt,
                domainId,
                (ips ?: JsonMissing.of()).map { it.toImmutable() },
                isDefault,
                name,
                recordType,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): IpPool = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        domainId()
        ips().ifPresent { it.forEach { it.validate() } }
        isDefault()
        name()
        recordType().ifPresent { it.validate() }
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
            (if (domainId.asKnown().isPresent) 1 else 0) +
            (ips.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * A dedicated IP as a member of a pool, with its routing weight in this pool. Weight is a
     * positive integer (default 100).
     */
    class Ip
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val billing: JsonField<DedicatedIp.Billing>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val dnsConfirmedAt: JsonField<OffsetDateTime>,
        private val ipAddress: JsonField<String>,
        private val ipVersion: JsonField<DedicatedIp.IpVersion>,
        private val poolId: JsonField<String>,
        private val provisioning: JsonField<DedicatedIp.Provisioning>,
        private val provisioningStatus: JsonField<DedicatedIp.ProvisioningStatus>,
        private val ptrHostname: JsonField<String>,
        private val quarantineUntil: JsonField<OffsetDateTime>,
        private val recordType: JsonField<DedicatedIp.RecordType>,
        private val region: JsonField<String>,
        private val releasedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<DedicatedIp.Status>,
        private val suspensionReason: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val warmup: JsonField<DedicatedIp.Warmup>,
        private val weight: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing")
            @ExcludeMissing
            billing: JsonField<DedicatedIp.Billing> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dns_confirmed_at")
            @ExcludeMissing
            dnsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ip_address")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ip_version")
            @ExcludeMissing
            ipVersion: JsonField<DedicatedIp.IpVersion> = JsonMissing.of(),
            @JsonProperty("pool_id") @ExcludeMissing poolId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provisioning")
            @ExcludeMissing
            provisioning: JsonField<DedicatedIp.Provisioning> = JsonMissing.of(),
            @JsonProperty("provisioning_status")
            @ExcludeMissing
            provisioningStatus: JsonField<DedicatedIp.ProvisioningStatus> = JsonMissing.of(),
            @JsonProperty("ptr_hostname")
            @ExcludeMissing
            ptrHostname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quarantine_until")
            @ExcludeMissing
            quarantineUntil: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<DedicatedIp.RecordType> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("released_at")
            @ExcludeMissing
            releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<DedicatedIp.Status> = JsonMissing.of(),
            @JsonProperty("suspension_reason")
            @ExcludeMissing
            suspensionReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("warmup")
            @ExcludeMissing
            warmup: JsonField<DedicatedIp.Warmup> = JsonMissing.of(),
            @JsonProperty("weight") @ExcludeMissing weight: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            billing,
            createdAt,
            dnsConfirmedAt,
            ipAddress,
            ipVersion,
            poolId,
            provisioning,
            provisioningStatus,
            ptrHostname,
            quarantineUntil,
            recordType,
            region,
            releasedAt,
            status,
            suspensionReason,
            updatedAt,
            warmup,
            weight,
            mutableMapOf(),
        )

        fun toDedicatedIp(): DedicatedIp =
            DedicatedIp.builder()
                .id(id)
                .billing(billing)
                .createdAt(createdAt)
                .dnsConfirmedAt(dnsConfirmedAt)
                .ipAddress(ipAddress)
                .ipVersion(ipVersion)
                .poolId(poolId)
                .provisioning(provisioning)
                .provisioningStatus(provisioningStatus)
                .ptrHostname(ptrHostname)
                .quarantineUntil(quarantineUntil)
                .recordType(recordType)
                .region(region)
                .releasedAt(releasedAt)
                .status(status)
                .suspensionReason(suspensionReason)
                .updatedAt(updatedAt)
                .warmup(warmup)
                .build()

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Monthly recurring charge (MRC) state for the IP's current allocation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billing(): Optional<DedicatedIp.Billing> = billing.getOptional("billing")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * When the PTR hostname was forward-confirmed (PTR → hostname → A record → this IP). The IP
         * carries mail only while this is set.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dnsConfirmedAt(): Optional<OffsetDateTime> =
            dnsConfirmedAt.getOptional("dns_confirmed_at")

        /**
         * The allocated IPv4/IPv6 address.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ipVersion(): Optional<DedicatedIp.IpVersion> = ipVersion.getOptional("ip_version")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun poolId(): Optional<String> = poolId.getOptional("pool_id")

        /**
         * Read-only status of the Telnyx-managed PTR record. No customer action is required to
         * complete it.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provisioning(): Optional<DedicatedIp.Provisioning> =
            provisioning.getOptional("provisioning")

        /**
         * Same value as `provisioning.dns_status`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun provisioningStatus(): Optional<DedicatedIp.ProvisioningStatus> =
            provisioningStatus.getOptional("provisioning_status")

        /**
         * Telnyx-managed reverse DNS (PTR) hostname of the IP, in the form
         * `mta-<a-b-c-d>.msgtelnyx.com`. Also used as the EHLO hostname when sending from the IP.
         * Managed by Telnyx and cannot be changed through the API.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ptrHostname(): Optional<String> = ptrHostname.getOptional("ptr_hostname")

        /**
         * Set on release to 30 days after `released_at`. The address is not returned to stock
         * before this time.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quarantineUntil(): Optional<OffsetDateTime> =
            quarantineUntil.getOptional("quarantine_until")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordType(): Optional<DedicatedIp.RecordType> = recordType.getOptional("record_type")

        /**
         * Region label of the allocated IP (for example, `ewr-nj1`).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

        /**
         * When the IP was released. Null until release.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun releasedAt(): Optional<OffsetDateTime> = releasedAt.getOptional("released_at")

        /**
         * Lifecycle status. `provisioning`: purchased and billed, carries no mail until
         * `start_warmup`. `warming_up`: warm-up ramp in progress. `active`: ramp complete.
         * `suspended`: suspended by Telnyx; carries no mail and is still billed. `released`:
         * returned to Telnyx; carries no mail.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<DedicatedIp.Status> = status.getOptional("status")

        /**
         * Reason Telnyx recorded when suspending the IP. Null unless `status` is `suspended`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun suspensionReason(): Optional<String> = suspensionReason.getOptional("suspension_reason")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * Warmup ramp state for a dedicated IP.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun warmup(): Optional<DedicatedIp.Warmup> = warmup.getOptional("warmup")

        /**
         * Relative routing weight of this IP within the pool.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun weight(): Optional<Long> = weight.getOptional("weight")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [billing].
         *
         * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billing")
        @ExcludeMissing
        fun _billing(): JsonField<DedicatedIp.Billing> = billing

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [dnsConfirmedAt].
         *
         * Unlike [dnsConfirmedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dns_confirmed_at")
        @ExcludeMissing
        fun _dnsConfirmedAt(): JsonField<OffsetDateTime> = dnsConfirmedAt

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_address") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

        /**
         * Returns the raw JSON value of [ipVersion].
         *
         * Unlike [ipVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_version")
        @ExcludeMissing
        fun _ipVersion(): JsonField<DedicatedIp.IpVersion> = ipVersion

        /**
         * Returns the raw JSON value of [poolId].
         *
         * Unlike [poolId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pool_id") @ExcludeMissing fun _poolId(): JsonField<String> = poolId

        /**
         * Returns the raw JSON value of [provisioning].
         *
         * Unlike [provisioning], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provisioning")
        @ExcludeMissing
        fun _provisioning(): JsonField<DedicatedIp.Provisioning> = provisioning

        /**
         * Returns the raw JSON value of [provisioningStatus].
         *
         * Unlike [provisioningStatus], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("provisioning_status")
        @ExcludeMissing
        fun _provisioningStatus(): JsonField<DedicatedIp.ProvisioningStatus> = provisioningStatus

        /**
         * Returns the raw JSON value of [ptrHostname].
         *
         * Unlike [ptrHostname], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ptr_hostname")
        @ExcludeMissing
        fun _ptrHostname(): JsonField<String> = ptrHostname

        /**
         * Returns the raw JSON value of [quarantineUntil].
         *
         * Unlike [quarantineUntil], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("quarantine_until")
        @ExcludeMissing
        fun _quarantineUntil(): JsonField<OffsetDateTime> = quarantineUntil

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<DedicatedIp.RecordType> = recordType

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [releasedAt].
         *
         * Unlike [releasedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("released_at")
        @ExcludeMissing
        fun _releasedAt(): JsonField<OffsetDateTime> = releasedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<DedicatedIp.Status> = status

        /**
         * Returns the raw JSON value of [suspensionReason].
         *
         * Unlike [suspensionReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("suspension_reason")
        @ExcludeMissing
        fun _suspensionReason(): JsonField<String> = suspensionReason

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [warmup].
         *
         * Unlike [warmup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("warmup")
        @ExcludeMissing
        fun _warmup(): JsonField<DedicatedIp.Warmup> = warmup

        /**
         * Returns the raw JSON value of [weight].
         *
         * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

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

            /** Returns a mutable builder for constructing an instance of [Ip]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Ip]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var billing: JsonField<DedicatedIp.Billing> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dnsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var ipAddress: JsonField<String> = JsonMissing.of()
            private var ipVersion: JsonField<DedicatedIp.IpVersion> = JsonMissing.of()
            private var poolId: JsonField<String> = JsonMissing.of()
            private var provisioning: JsonField<DedicatedIp.Provisioning> = JsonMissing.of()
            private var provisioningStatus: JsonField<DedicatedIp.ProvisioningStatus> =
                JsonMissing.of()
            private var ptrHostname: JsonField<String> = JsonMissing.of()
            private var quarantineUntil: JsonField<OffsetDateTime> = JsonMissing.of()
            private var recordType: JsonField<DedicatedIp.RecordType> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<DedicatedIp.Status> = JsonMissing.of()
            private var suspensionReason: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var warmup: JsonField<DedicatedIp.Warmup> = JsonMissing.of()
            private var weight: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ip: Ip) = apply {
                id = ip.id
                billing = ip.billing
                createdAt = ip.createdAt
                dnsConfirmedAt = ip.dnsConfirmedAt
                ipAddress = ip.ipAddress
                ipVersion = ip.ipVersion
                poolId = ip.poolId
                provisioning = ip.provisioning
                provisioningStatus = ip.provisioningStatus
                ptrHostname = ip.ptrHostname
                quarantineUntil = ip.quarantineUntil
                recordType = ip.recordType
                region = ip.region
                releasedAt = ip.releasedAt
                status = ip.status
                suspensionReason = ip.suspensionReason
                updatedAt = ip.updatedAt
                warmup = ip.warmup
                weight = ip.weight
                additionalProperties = ip.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Monthly recurring charge (MRC) state for the IP's current allocation. */
            fun billing(billing: DedicatedIp.Billing) = billing(JsonField.of(billing))

            /**
             * Sets [Builder.billing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billing] with a well-typed [DedicatedIp.Billing]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billing(billing: JsonField<DedicatedIp.Billing>) = apply { this.billing = billing }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * When the PTR hostname was forward-confirmed (PTR → hostname → A record → this IP).
             * The IP carries mail only while this is set.
             */
            fun dnsConfirmedAt(dnsConfirmedAt: OffsetDateTime?) =
                dnsConfirmedAt(JsonField.ofNullable(dnsConfirmedAt))

            /** Alias for calling [Builder.dnsConfirmedAt] with `dnsConfirmedAt.orElse(null)`. */
            fun dnsConfirmedAt(dnsConfirmedAt: Optional<OffsetDateTime>) =
                dnsConfirmedAt(dnsConfirmedAt.getOrNull())

            /**
             * Sets [Builder.dnsConfirmedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dnsConfirmedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dnsConfirmedAt(dnsConfirmedAt: JsonField<OffsetDateTime>) = apply {
                this.dnsConfirmedAt = dnsConfirmedAt
            }

            /** The allocated IPv4/IPv6 address. */
            fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            fun ipVersion(ipVersion: DedicatedIp.IpVersion) = ipVersion(JsonField.of(ipVersion))

            /**
             * Sets [Builder.ipVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipVersion] with a well-typed [DedicatedIp.IpVersion]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ipVersion(ipVersion: JsonField<DedicatedIp.IpVersion>) = apply {
                this.ipVersion = ipVersion
            }

            fun poolId(poolId: String?) = poolId(JsonField.ofNullable(poolId))

            /** Alias for calling [Builder.poolId] with `poolId.orElse(null)`. */
            fun poolId(poolId: Optional<String>) = poolId(poolId.getOrNull())

            /**
             * Sets [Builder.poolId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.poolId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun poolId(poolId: JsonField<String>) = apply { this.poolId = poolId }

            /**
             * Read-only status of the Telnyx-managed PTR record. No customer action is required to
             * complete it.
             */
            fun provisioning(provisioning: DedicatedIp.Provisioning) =
                provisioning(JsonField.of(provisioning))

            /**
             * Sets [Builder.provisioning] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provisioning] with a well-typed
             * [DedicatedIp.Provisioning] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun provisioning(provisioning: JsonField<DedicatedIp.Provisioning>) = apply {
                this.provisioning = provisioning
            }

            /** Same value as `provisioning.dns_status`. */
            fun provisioningStatus(provisioningStatus: DedicatedIp.ProvisioningStatus) =
                provisioningStatus(JsonField.of(provisioningStatus))

            /**
             * Sets [Builder.provisioningStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provisioningStatus] with a well-typed
             * [DedicatedIp.ProvisioningStatus] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun provisioningStatus(provisioningStatus: JsonField<DedicatedIp.ProvisioningStatus>) =
                apply {
                    this.provisioningStatus = provisioningStatus
                }

            /**
             * Telnyx-managed reverse DNS (PTR) hostname of the IP, in the form
             * `mta-<a-b-c-d>.msgtelnyx.com`. Also used as the EHLO hostname when sending from the
             * IP. Managed by Telnyx and cannot be changed through the API.
             */
            fun ptrHostname(ptrHostname: String?) = ptrHostname(JsonField.ofNullable(ptrHostname))

            /** Alias for calling [Builder.ptrHostname] with `ptrHostname.orElse(null)`. */
            fun ptrHostname(ptrHostname: Optional<String>) = ptrHostname(ptrHostname.getOrNull())

            /**
             * Sets [Builder.ptrHostname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ptrHostname] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ptrHostname(ptrHostname: JsonField<String>) = apply {
                this.ptrHostname = ptrHostname
            }

            /**
             * Set on release to 30 days after `released_at`. The address is not returned to stock
             * before this time.
             */
            fun quarantineUntil(quarantineUntil: OffsetDateTime?) =
                quarantineUntil(JsonField.ofNullable(quarantineUntil))

            /** Alias for calling [Builder.quarantineUntil] with `quarantineUntil.orElse(null)`. */
            fun quarantineUntil(quarantineUntil: Optional<OffsetDateTime>) =
                quarantineUntil(quarantineUntil.getOrNull())

            /**
             * Sets [Builder.quarantineUntil] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quarantineUntil] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun quarantineUntil(quarantineUntil: JsonField<OffsetDateTime>) = apply {
                this.quarantineUntil = quarantineUntil
            }

            fun recordType(recordType: DedicatedIp.RecordType) =
                recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed
             * [DedicatedIp.RecordType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun recordType(recordType: JsonField<DedicatedIp.RecordType>) = apply {
                this.recordType = recordType
            }

            /** Region label of the allocated IP (for example, `ewr-nj1`). */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            /** When the IP was released. Null until release. */
            fun releasedAt(releasedAt: OffsetDateTime?) =
                releasedAt(JsonField.ofNullable(releasedAt))

            /** Alias for calling [Builder.releasedAt] with `releasedAt.orElse(null)`. */
            fun releasedAt(releasedAt: Optional<OffsetDateTime>) =
                releasedAt(releasedAt.getOrNull())

            /**
             * Sets [Builder.releasedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.releasedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                this.releasedAt = releasedAt
            }

            /**
             * Lifecycle status. `provisioning`: purchased and billed, carries no mail until
             * `start_warmup`. `warming_up`: warm-up ramp in progress. `active`: ramp complete.
             * `suspended`: suspended by Telnyx; carries no mail and is still billed. `released`:
             * returned to Telnyx; carries no mail.
             */
            fun status(status: DedicatedIp.Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [DedicatedIp.Status] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<DedicatedIp.Status>) = apply { this.status = status }

            /**
             * Reason Telnyx recorded when suspending the IP. Null unless `status` is `suspended`.
             */
            fun suspensionReason(suspensionReason: String?) =
                suspensionReason(JsonField.ofNullable(suspensionReason))

            /**
             * Alias for calling [Builder.suspensionReason] with `suspensionReason.orElse(null)`.
             */
            fun suspensionReason(suspensionReason: Optional<String>) =
                suspensionReason(suspensionReason.getOrNull())

            /**
             * Sets [Builder.suspensionReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suspensionReason] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suspensionReason(suspensionReason: JsonField<String>) = apply {
                this.suspensionReason = suspensionReason
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** Warmup ramp state for a dedicated IP. */
            fun warmup(warmup: DedicatedIp.Warmup) = warmup(JsonField.of(warmup))

            /**
             * Sets [Builder.warmup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.warmup] with a well-typed [DedicatedIp.Warmup] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun warmup(warmup: JsonField<DedicatedIp.Warmup>) = apply { this.warmup = warmup }

            /** Relative routing weight of this IP within the pool. */
            fun weight(weight: Long) = weight(JsonField.of(weight))

            /**
             * Sets [Builder.weight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.weight] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun weight(weight: JsonField<Long>) = apply { this.weight = weight }

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
             * Returns an immutable instance of [Ip].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Ip =
                Ip(
                    id,
                    billing,
                    createdAt,
                    dnsConfirmedAt,
                    ipAddress,
                    ipVersion,
                    poolId,
                    provisioning,
                    provisioningStatus,
                    ptrHostname,
                    quarantineUntil,
                    recordType,
                    region,
                    releasedAt,
                    status,
                    suspensionReason,
                    updatedAt,
                    warmup,
                    weight,
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
        fun validate(): Ip = apply {
            if (validated) {
                return@apply
            }

            id()
            billing().ifPresent { it.validate() }
            createdAt()
            dnsConfirmedAt()
            ipAddress()
            ipVersion().ifPresent { it.validate() }
            poolId()
            provisioning().ifPresent { it.validate() }
            provisioningStatus().ifPresent { it.validate() }
            ptrHostname()
            quarantineUntil()
            recordType().ifPresent { it.validate() }
            region()
            releasedAt()
            status().ifPresent { it.validate() }
            suspensionReason()
            updatedAt()
            warmup().ifPresent { it.validate() }
            weight()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (billing.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (dnsConfirmedAt.asKnown().isPresent) 1 else 0) +
                (if (ipAddress.asKnown().isPresent) 1 else 0) +
                (ipVersion.asKnown().getOrNull()?.validity() ?: 0) +
                (if (poolId.asKnown().isPresent) 1 else 0) +
                (provisioning.asKnown().getOrNull()?.validity() ?: 0) +
                (provisioningStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (ptrHostname.asKnown().isPresent) 1 else 0) +
                (if (quarantineUntil.asKnown().isPresent) 1 else 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (releasedAt.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (suspensionReason.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (warmup.asKnown().getOrNull()?.validity() ?: 0) +
                (if (weight.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ip &&
                id == other.id &&
                billing == other.billing &&
                createdAt == other.createdAt &&
                dnsConfirmedAt == other.dnsConfirmedAt &&
                ipAddress == other.ipAddress &&
                ipVersion == other.ipVersion &&
                poolId == other.poolId &&
                provisioning == other.provisioning &&
                provisioningStatus == other.provisioningStatus &&
                ptrHostname == other.ptrHostname &&
                quarantineUntil == other.quarantineUntil &&
                recordType == other.recordType &&
                region == other.region &&
                releasedAt == other.releasedAt &&
                status == other.status &&
                suspensionReason == other.suspensionReason &&
                updatedAt == other.updatedAt &&
                warmup == other.warmup &&
                weight == other.weight &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                billing,
                createdAt,
                dnsConfirmedAt,
                ipAddress,
                ipVersion,
                poolId,
                provisioning,
                provisioningStatus,
                ptrHostname,
                quarantineUntil,
                recordType,
                region,
                releasedAt,
                status,
                suspensionReason,
                updatedAt,
                warmup,
                weight,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Ip{id=$id, billing=$billing, createdAt=$createdAt, dnsConfirmedAt=$dnsConfirmedAt, ipAddress=$ipAddress, ipVersion=$ipVersion, poolId=$poolId, provisioning=$provisioning, provisioningStatus=$provisioningStatus, ptrHostname=$ptrHostname, quarantineUntil=$quarantineUntil, recordType=$recordType, region=$region, releasedAt=$releasedAt, status=$status, suspensionReason=$suspensionReason, updatedAt=$updatedAt, warmup=$warmup, weight=$weight, additionalProperties=$additionalProperties}"
    }

    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val IP_POOL = of("ip_pool")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            IP_POOL
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IP_POOL,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
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
                IP_POOL -> Value.IP_POOL
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
                IP_POOL -> Known.IP_POOL
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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
        fun validate(): RecordType = apply {
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

            return other is RecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IpPool &&
            id == other.id &&
            createdAt == other.createdAt &&
            domainId == other.domainId &&
            ips == other.ips &&
            isDefault == other.isDefault &&
            name == other.name &&
            recordType == other.recordType &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            domainId,
            ips,
            isDefault,
            name,
            recordType,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IpPool{id=$id, createdAt=$createdAt, domainId=$domainId, ips=$ips, isDefault=$isDefault, name=$name, recordType=$recordType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
