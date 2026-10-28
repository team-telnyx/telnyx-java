// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.email.dedicatedips

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A dedicated sending IP address owned by the account. */
class DedicatedIp
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val billing: JsonField<Billing>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dnsConfirmedAt: JsonField<OffsetDateTime>,
    private val ipAddress: JsonField<String>,
    private val ipVersion: JsonField<IpVersion>,
    private val poolId: JsonField<String>,
    private val provisioning: JsonField<Provisioning>,
    private val provisioningStatus: JsonField<ProvisioningStatus>,
    private val ptrHostname: JsonField<String>,
    private val quarantineUntil: JsonField<OffsetDateTime>,
    private val recordType: JsonField<RecordType>,
    private val region: JsonField<String>,
    private val releasedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val suspensionReason: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val warmup: JsonField<Warmup>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing") @ExcludeMissing billing: JsonField<Billing> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dns_confirmed_at")
        @ExcludeMissing
        dnsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ip_address") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ip_version")
        @ExcludeMissing
        ipVersion: JsonField<IpVersion> = JsonMissing.of(),
        @JsonProperty("pool_id") @ExcludeMissing poolId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provisioning")
        @ExcludeMissing
        provisioning: JsonField<Provisioning> = JsonMissing.of(),
        @JsonProperty("provisioning_status")
        @ExcludeMissing
        provisioningStatus: JsonField<ProvisioningStatus> = JsonMissing.of(),
        @JsonProperty("ptr_hostname")
        @ExcludeMissing
        ptrHostname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quarantine_until")
        @ExcludeMissing
        quarantineUntil: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("released_at")
        @ExcludeMissing
        releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("suspension_reason")
        @ExcludeMissing
        suspensionReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("warmup") @ExcludeMissing warmup: JsonField<Warmup> = JsonMissing.of(),
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
        mutableMapOf(),
    )

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
    fun billing(): Optional<Billing> = billing.getOptional("billing")

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
    fun dnsConfirmedAt(): Optional<OffsetDateTime> = dnsConfirmedAt.getOptional("dns_confirmed_at")

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
    fun ipVersion(): Optional<IpVersion> = ipVersion.getOptional("ip_version")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun poolId(): Optional<String> = poolId.getOptional("pool_id")

    /**
     * Read-only status of the Telnyx-managed PTR record. No customer action is required to complete
     * it.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provisioning(): Optional<Provisioning> = provisioning.getOptional("provisioning")

    /**
     * Same value as `provisioning.dns_status`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provisioningStatus(): Optional<ProvisioningStatus> =
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
     * Set on release to 30 days after `released_at`. The address is not returned to stock before
     * this time.
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
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

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
     * Lifecycle status. `provisioning`: purchased and billed, carries no mail until `start_warmup`.
     * `warming_up`: warm-up ramp in progress. `active`: ramp complete. `suspended`: suspended by
     * Telnyx; carries no mail and is still billed. `released`: returned to Telnyx; carries no mail.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

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
    fun warmup(): Optional<Warmup> = warmup.getOptional("warmup")

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
    @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<Billing> = billing

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
     * Unlike [dnsConfirmedAt], this method doesn't throw if the JSON field has an unexpected type.
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
    @JsonProperty("ip_version") @ExcludeMissing fun _ipVersion(): JsonField<IpVersion> = ipVersion

    /**
     * Returns the raw JSON value of [poolId].
     *
     * Unlike [poolId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pool_id") @ExcludeMissing fun _poolId(): JsonField<String> = poolId

    /**
     * Returns the raw JSON value of [provisioning].
     *
     * Unlike [provisioning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provisioning")
    @ExcludeMissing
    fun _provisioning(): JsonField<Provisioning> = provisioning

    /**
     * Returns the raw JSON value of [provisioningStatus].
     *
     * Unlike [provisioningStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("provisioning_status")
    @ExcludeMissing
    fun _provisioningStatus(): JsonField<ProvisioningStatus> = provisioningStatus

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
     * Unlike [quarantineUntil], this method doesn't throw if the JSON field has an unexpected type.
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
    fun _recordType(): JsonField<RecordType> = recordType

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
    @JsonProperty("warmup") @ExcludeMissing fun _warmup(): JsonField<Warmup> = warmup

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

        /** Returns a mutable builder for constructing an instance of [DedicatedIp]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DedicatedIp]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var billing: JsonField<Billing> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dnsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ipAddress: JsonField<String> = JsonMissing.of()
        private var ipVersion: JsonField<IpVersion> = JsonMissing.of()
        private var poolId: JsonField<String> = JsonMissing.of()
        private var provisioning: JsonField<Provisioning> = JsonMissing.of()
        private var provisioningStatus: JsonField<ProvisioningStatus> = JsonMissing.of()
        private var ptrHostname: JsonField<String> = JsonMissing.of()
        private var quarantineUntil: JsonField<OffsetDateTime> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var suspensionReason: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var warmup: JsonField<Warmup> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dedicatedIp: DedicatedIp) = apply {
            id = dedicatedIp.id
            billing = dedicatedIp.billing
            createdAt = dedicatedIp.createdAt
            dnsConfirmedAt = dedicatedIp.dnsConfirmedAt
            ipAddress = dedicatedIp.ipAddress
            ipVersion = dedicatedIp.ipVersion
            poolId = dedicatedIp.poolId
            provisioning = dedicatedIp.provisioning
            provisioningStatus = dedicatedIp.provisioningStatus
            ptrHostname = dedicatedIp.ptrHostname
            quarantineUntil = dedicatedIp.quarantineUntil
            recordType = dedicatedIp.recordType
            region = dedicatedIp.region
            releasedAt = dedicatedIp.releasedAt
            status = dedicatedIp.status
            suspensionReason = dedicatedIp.suspensionReason
            updatedAt = dedicatedIp.updatedAt
            warmup = dedicatedIp.warmup
            additionalProperties = dedicatedIp.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Monthly recurring charge (MRC) state for the IP's current allocation. */
        fun billing(billing: Billing) = billing(JsonField.of(billing))

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed [Billing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun billing(billing: JsonField<Billing>) = apply { this.billing = billing }

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
         * When the PTR hostname was forward-confirmed (PTR → hostname → A record → this IP). The IP
         * carries mail only while this is set.
         */
        fun dnsConfirmedAt(dnsConfirmedAt: OffsetDateTime?) =
            dnsConfirmedAt(JsonField.ofNullable(dnsConfirmedAt))

        /** Alias for calling [Builder.dnsConfirmedAt] with `dnsConfirmedAt.orElse(null)`. */
        fun dnsConfirmedAt(dnsConfirmedAt: Optional<OffsetDateTime>) =
            dnsConfirmedAt(dnsConfirmedAt.getOrNull())

        /**
         * Sets [Builder.dnsConfirmedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dnsConfirmedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        fun ipVersion(ipVersion: IpVersion) = ipVersion(JsonField.of(ipVersion))

        /**
         * Sets [Builder.ipVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipVersion] with a well-typed [IpVersion] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipVersion(ipVersion: JsonField<IpVersion>) = apply { this.ipVersion = ipVersion }

        fun poolId(poolId: String?) = poolId(JsonField.ofNullable(poolId))

        /** Alias for calling [Builder.poolId] with `poolId.orElse(null)`. */
        fun poolId(poolId: Optional<String>) = poolId(poolId.getOrNull())

        /**
         * Sets [Builder.poolId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poolId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poolId(poolId: JsonField<String>) = apply { this.poolId = poolId }

        /**
         * Read-only status of the Telnyx-managed PTR record. No customer action is required to
         * complete it.
         */
        fun provisioning(provisioning: Provisioning) = provisioning(JsonField.of(provisioning))

        /**
         * Sets [Builder.provisioning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provisioning] with a well-typed [Provisioning] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun provisioning(provisioning: JsonField<Provisioning>) = apply {
            this.provisioning = provisioning
        }

        /** Same value as `provisioning.dns_status`. */
        fun provisioningStatus(provisioningStatus: ProvisioningStatus) =
            provisioningStatus(JsonField.of(provisioningStatus))

        /**
         * Sets [Builder.provisioningStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provisioningStatus] with a well-typed
         * [ProvisioningStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun provisioningStatus(provisioningStatus: JsonField<ProvisioningStatus>) = apply {
            this.provisioningStatus = provisioningStatus
        }

        /**
         * Telnyx-managed reverse DNS (PTR) hostname of the IP, in the form
         * `mta-<a-b-c-d>.msgtelnyx.com`. Also used as the EHLO hostname when sending from the IP.
         * Managed by Telnyx and cannot be changed through the API.
         */
        fun ptrHostname(ptrHostname: String?) = ptrHostname(JsonField.ofNullable(ptrHostname))

        /** Alias for calling [Builder.ptrHostname] with `ptrHostname.orElse(null)`. */
        fun ptrHostname(ptrHostname: Optional<String>) = ptrHostname(ptrHostname.getOrNull())

        /**
         * Sets [Builder.ptrHostname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ptrHostname] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ptrHostname(ptrHostname: JsonField<String>) = apply { this.ptrHostname = ptrHostname }

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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun quarantineUntil(quarantineUntil: JsonField<OffsetDateTime>) = apply {
            this.quarantineUntil = quarantineUntil
        }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** Region label of the allocated IP (for example, `ewr-nj1`). */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        /** When the IP was released. Null until release. */
        fun releasedAt(releasedAt: OffsetDateTime?) = releasedAt(JsonField.ofNullable(releasedAt))

        /** Alias for calling [Builder.releasedAt] with `releasedAt.orElse(null)`. */
        fun releasedAt(releasedAt: Optional<OffsetDateTime>) = releasedAt(releasedAt.getOrNull())

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
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Reason Telnyx recorded when suspending the IP. Null unless `status` is `suspended`. */
        fun suspensionReason(suspensionReason: String?) =
            suspensionReason(JsonField.ofNullable(suspensionReason))

        /** Alias for calling [Builder.suspensionReason] with `suspensionReason.orElse(null)`. */
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
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Warmup ramp state for a dedicated IP. */
        fun warmup(warmup: Warmup) = warmup(JsonField.of(warmup))

        /**
         * Sets [Builder.warmup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.warmup] with a well-typed [Warmup] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun warmup(warmup: JsonField<Warmup>) = apply { this.warmup = warmup }

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
         * Returns an immutable instance of [DedicatedIp].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DedicatedIp =
            DedicatedIp(
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
    fun validate(): DedicatedIp = apply {
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
            (warmup.asKnown().getOrNull()?.validity() ?: 0)

    /** Monthly recurring charge (MRC) state for the IP's current allocation. */
    class Billing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val charged: JsonField<Boolean>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("charged") @ExcludeMissing charged: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(charged, status, mutableMapOf())

        /**
         * True when `status` is `active`, `stopping`, or `stop_failed`. An IP carries mail only
         * after its charge has been created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun charged(): Optional<Boolean> = charged.getOptional("charged")

        /**
         * `not_started`: no charge recorded for the current allocation. `pending`: the charge is
         * queued. `in_progress`: the charge is being created. `active`: the MRC is active.
         * `stopping`: release requested; the MRC stop is being processed. `stopped`: the MRC has
         * stopped. `stop_failed`: the MRC stop failed and the charge remains. `failed`: the charge
         * could not be created.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [charged].
         *
         * Unlike [charged], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("charged") @ExcludeMissing fun _charged(): JsonField<Boolean> = charged

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [Billing]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Billing]. */
        class Builder internal constructor() {

            private var charged: JsonField<Boolean> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billing: Billing) = apply {
                charged = billing.charged
                status = billing.status
                additionalProperties = billing.additionalProperties.toMutableMap()
            }

            /**
             * True when `status` is `active`, `stopping`, or `stop_failed`. An IP carries mail only
             * after its charge has been created.
             */
            fun charged(charged: Boolean) = charged(JsonField.of(charged))

            /**
             * Sets [Builder.charged] to an arbitrary JSON value.
             *
             * You should usually call [Builder.charged] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun charged(charged: JsonField<Boolean>) = apply { this.charged = charged }

            /**
             * `not_started`: no charge recorded for the current allocation. `pending`: the charge
             * is queued. `in_progress`: the charge is being created. `active`: the MRC is active.
             * `stopping`: release requested; the MRC stop is being processed. `stopped`: the MRC
             * has stopped. `stop_failed`: the MRC stop failed and the charge remains. `failed`: the
             * charge could not be created.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [Billing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Billing = Billing(charged, status, additionalProperties.toMutableMap())
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
        fun validate(): Billing = apply {
            if (validated) {
                return@apply
            }

            charged()
            status().ifPresent { it.validate() }
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
            (if (charged.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * `not_started`: no charge recorded for the current allocation. `pending`: the charge is
         * queued. `in_progress`: the charge is being created. `active`: the MRC is active.
         * `stopping`: release requested; the MRC stop is being processed. `stopped`: the MRC has
         * stopped. `stop_failed`: the MRC stop failed and the charge remains. `failed`: the charge
         * could not be created.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val NOT_STARTED = of("not_started")

                @JvmField val PENDING = of("pending")

                @JvmField val IN_PROGRESS = of("in_progress")

                @JvmField val ACTIVE = of("active")

                @JvmField val STOPPING = of("stopping")

                @JvmField val STOPPED = of("stopped")

                @JvmField val STOP_FAILED = of("stop_failed")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                NOT_STARTED,
                PENDING,
                IN_PROGRESS,
                ACTIVE,
                STOPPING,
                STOPPED,
                STOP_FAILED,
                FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NOT_STARTED,
                PENDING,
                IN_PROGRESS,
                ACTIVE,
                STOPPING,
                STOPPED,
                STOP_FAILED,
                FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    NOT_STARTED -> Value.NOT_STARTED
                    PENDING -> Value.PENDING
                    IN_PROGRESS -> Value.IN_PROGRESS
                    ACTIVE -> Value.ACTIVE
                    STOPPING -> Value.STOPPING
                    STOPPED -> Value.STOPPED
                    STOP_FAILED -> Value.STOP_FAILED
                    FAILED -> Value.FAILED
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
                    NOT_STARTED -> Known.NOT_STARTED
                    PENDING -> Known.PENDING
                    IN_PROGRESS -> Known.IN_PROGRESS
                    ACTIVE -> Known.ACTIVE
                    STOPPING -> Known.STOPPING
                    STOPPED -> Known.STOPPED
                    STOP_FAILED -> Known.STOP_FAILED
                    FAILED -> Known.FAILED
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Billing &&
                charged == other.charged &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(charged, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Billing{charged=$charged, status=$status, additionalProperties=$additionalProperties}"
    }

    class IpVersion @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val IPV4 = of("ipv4")

            @JvmField val IPV6 = of("ipv6")

            @JvmStatic fun of(value: String) = IpVersion(JsonField.of(value))
        }

        /** An enum containing [IpVersion]'s known values. */
        enum class Known {
            IPV4,
            IPV6,
        }

        /**
         * An enum containing [IpVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [IpVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IPV4,
            IPV6,
            /**
             * An enum member indicating that [IpVersion] was instantiated with an unknown value.
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
                IPV4 -> Value.IPV4
                IPV6 -> Value.IPV6
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
                IPV4 -> Known.IPV4
                IPV6 -> Known.IPV6
                else -> throw TelnyxInvalidDataException("Unknown IpVersion: $value")
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
        fun validate(): IpVersion = apply {
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

            return other is IpVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Read-only status of the Telnyx-managed PTR record. No customer action is required to complete
     * it.
     */
    class Provisioning
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val checklist: JsonField<Checklist>,
        private val dnsStatus: JsonField<DnsStatus>,
        private val ptrRequestPrUrl: JsonField<String>,
        private val ptrRequestState: JsonField<PtrRequestState>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("checklist")
            @ExcludeMissing
            checklist: JsonField<Checklist> = JsonMissing.of(),
            @JsonProperty("dns_status")
            @ExcludeMissing
            dnsStatus: JsonField<DnsStatus> = JsonMissing.of(),
            @JsonProperty("ptr_request_pr_url")
            @ExcludeMissing
            ptrRequestPrUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ptr_request_state")
            @ExcludeMissing
            ptrRequestState: JsonField<PtrRequestState> = JsonMissing.of(),
        ) : this(checklist, dnsStatus, ptrRequestPrUrl, ptrRequestState, mutableMapOf())

        /**
         * Informational progress flags for the Telnyx-managed PTR. They do not gate `start_warmup`;
         * use `dns_status` to check whether the IP can carry mail.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun checklist(): Optional<Checklist> = checklist.getOptional("checklist")

        /**
         * `dns_confirmed`: the PTR is forward-confirmed and `dns_confirmed_at` is set.
         * `pending_ptr`: the PTR record is not yet in place. `pending_dns`: the PTR record is
         * waiting for forward confirmation. `dns_lost`: a previously confirmed PTR no longer
         * confirms, or the PTR request was abandoned before it ever confirmed (`ptr_request_state`
         * is `abandoned`); the IP carries no mail until DNS is confirmed. `not_applicable`: the IP
         * is released or has no PTR record on file.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dnsStatus(): Optional<DnsStatus> = dnsStatus.getOptional("dns_status")

        /**
         * Reference to the Telnyx PTR change request, when one exists. Informational.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ptrRequestPrUrl(): Optional<String> = ptrRequestPrUrl.getOptional("ptr_request_pr_url")

        /**
         * State of the Telnyx PTR change: `pending`, `pr_open`, `merged`, `confirmed`, `failed`, or
         * `abandoned`. Informational.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ptrRequestState(): Optional<PtrRequestState> =
            ptrRequestState.getOptional("ptr_request_state")

        /**
         * Returns the raw JSON value of [checklist].
         *
         * Unlike [checklist], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("checklist")
        @ExcludeMissing
        fun _checklist(): JsonField<Checklist> = checklist

        /**
         * Returns the raw JSON value of [dnsStatus].
         *
         * Unlike [dnsStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dns_status")
        @ExcludeMissing
        fun _dnsStatus(): JsonField<DnsStatus> = dnsStatus

        /**
         * Returns the raw JSON value of [ptrRequestPrUrl].
         *
         * Unlike [ptrRequestPrUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ptr_request_pr_url")
        @ExcludeMissing
        fun _ptrRequestPrUrl(): JsonField<String> = ptrRequestPrUrl

        /**
         * Returns the raw JSON value of [ptrRequestState].
         *
         * Unlike [ptrRequestState], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ptr_request_state")
        @ExcludeMissing
        fun _ptrRequestState(): JsonField<PtrRequestState> = ptrRequestState

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

            /** Returns a mutable builder for constructing an instance of [Provisioning]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Provisioning]. */
        class Builder internal constructor() {

            private var checklist: JsonField<Checklist> = JsonMissing.of()
            private var dnsStatus: JsonField<DnsStatus> = JsonMissing.of()
            private var ptrRequestPrUrl: JsonField<String> = JsonMissing.of()
            private var ptrRequestState: JsonField<PtrRequestState> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(provisioning: Provisioning) = apply {
                checklist = provisioning.checklist
                dnsStatus = provisioning.dnsStatus
                ptrRequestPrUrl = provisioning.ptrRequestPrUrl
                ptrRequestState = provisioning.ptrRequestState
                additionalProperties = provisioning.additionalProperties.toMutableMap()
            }

            /**
             * Informational progress flags for the Telnyx-managed PTR. They do not gate
             * `start_warmup`; use `dns_status` to check whether the IP can carry mail.
             */
            fun checklist(checklist: Checklist) = checklist(JsonField.of(checklist))

            /**
             * Sets [Builder.checklist] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checklist] with a well-typed [Checklist] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checklist(checklist: JsonField<Checklist>) = apply { this.checklist = checklist }

            /**
             * `dns_confirmed`: the PTR is forward-confirmed and `dns_confirmed_at` is set.
             * `pending_ptr`: the PTR record is not yet in place. `pending_dns`: the PTR record is
             * waiting for forward confirmation. `dns_lost`: a previously confirmed PTR no longer
             * confirms, or the PTR request was abandoned before it ever confirmed
             * (`ptr_request_state` is `abandoned`); the IP carries no mail until DNS is confirmed.
             * `not_applicable`: the IP is released or has no PTR record on file.
             */
            fun dnsStatus(dnsStatus: DnsStatus) = dnsStatus(JsonField.of(dnsStatus))

            /**
             * Sets [Builder.dnsStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dnsStatus] with a well-typed [DnsStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dnsStatus(dnsStatus: JsonField<DnsStatus>) = apply { this.dnsStatus = dnsStatus }

            /** Reference to the Telnyx PTR change request, when one exists. Informational. */
            fun ptrRequestPrUrl(ptrRequestPrUrl: String?) =
                ptrRequestPrUrl(JsonField.ofNullable(ptrRequestPrUrl))

            /** Alias for calling [Builder.ptrRequestPrUrl] with `ptrRequestPrUrl.orElse(null)`. */
            fun ptrRequestPrUrl(ptrRequestPrUrl: Optional<String>) =
                ptrRequestPrUrl(ptrRequestPrUrl.getOrNull())

            /**
             * Sets [Builder.ptrRequestPrUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ptrRequestPrUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ptrRequestPrUrl(ptrRequestPrUrl: JsonField<String>) = apply {
                this.ptrRequestPrUrl = ptrRequestPrUrl
            }

            /**
             * State of the Telnyx PTR change: `pending`, `pr_open`, `merged`, `confirmed`,
             * `failed`, or `abandoned`. Informational.
             */
            fun ptrRequestState(ptrRequestState: PtrRequestState?) =
                ptrRequestState(JsonField.ofNullable(ptrRequestState))

            /** Alias for calling [Builder.ptrRequestState] with `ptrRequestState.orElse(null)`. */
            fun ptrRequestState(ptrRequestState: Optional<PtrRequestState>) =
                ptrRequestState(ptrRequestState.getOrNull())

            /**
             * Sets [Builder.ptrRequestState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ptrRequestState] with a well-typed [PtrRequestState]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ptrRequestState(ptrRequestState: JsonField<PtrRequestState>) = apply {
                this.ptrRequestState = ptrRequestState
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
             * Returns an immutable instance of [Provisioning].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Provisioning =
                Provisioning(
                    checklist,
                    dnsStatus,
                    ptrRequestPrUrl,
                    ptrRequestState,
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
        fun validate(): Provisioning = apply {
            if (validated) {
                return@apply
            }

            checklist().ifPresent { it.validate() }
            dnsStatus().ifPresent { it.validate() }
            ptrRequestPrUrl()
            ptrRequestState().ifPresent { it.validate() }
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
            (checklist.asKnown().getOrNull()?.validity() ?: 0) +
                (dnsStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (ptrRequestPrUrl.asKnown().isPresent) 1 else 0) +
                (ptrRequestState.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Informational progress flags for the Telnyx-managed PTR. They do not gate `start_warmup`;
         * use `dns_status` to check whether the IP can carry mail.
         */
        class Checklist
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val forwardConfirmed: JsonField<Boolean>,
            private val ptrAuthored: JsonField<Boolean>,
            private val ptrMerged: JsonField<Boolean>,
            private val ptrRequested: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("forward_confirmed")
                @ExcludeMissing
                forwardConfirmed: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("ptr_authored")
                @ExcludeMissing
                ptrAuthored: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("ptr_merged")
                @ExcludeMissing
                ptrMerged: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("ptr_requested")
                @ExcludeMissing
                ptrRequested: JsonField<Boolean> = JsonMissing.of(),
            ) : this(forwardConfirmed, ptrAuthored, ptrMerged, ptrRequested, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun forwardConfirmed(): Optional<Boolean> =
                forwardConfirmed.getOptional("forward_confirmed")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ptrAuthored(): Optional<Boolean> = ptrAuthored.getOptional("ptr_authored")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ptrMerged(): Optional<Boolean> = ptrMerged.getOptional("ptr_merged")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ptrRequested(): Optional<Boolean> = ptrRequested.getOptional("ptr_requested")

            /**
             * Returns the raw JSON value of [forwardConfirmed].
             *
             * Unlike [forwardConfirmed], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("forward_confirmed")
            @ExcludeMissing
            fun _forwardConfirmed(): JsonField<Boolean> = forwardConfirmed

            /**
             * Returns the raw JSON value of [ptrAuthored].
             *
             * Unlike [ptrAuthored], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ptr_authored")
            @ExcludeMissing
            fun _ptrAuthored(): JsonField<Boolean> = ptrAuthored

            /**
             * Returns the raw JSON value of [ptrMerged].
             *
             * Unlike [ptrMerged], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ptr_merged")
            @ExcludeMissing
            fun _ptrMerged(): JsonField<Boolean> = ptrMerged

            /**
             * Returns the raw JSON value of [ptrRequested].
             *
             * Unlike [ptrRequested], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ptr_requested")
            @ExcludeMissing
            fun _ptrRequested(): JsonField<Boolean> = ptrRequested

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

                /** Returns a mutable builder for constructing an instance of [Checklist]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Checklist]. */
            class Builder internal constructor() {

                private var forwardConfirmed: JsonField<Boolean> = JsonMissing.of()
                private var ptrAuthored: JsonField<Boolean> = JsonMissing.of()
                private var ptrMerged: JsonField<Boolean> = JsonMissing.of()
                private var ptrRequested: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checklist: Checklist) = apply {
                    forwardConfirmed = checklist.forwardConfirmed
                    ptrAuthored = checklist.ptrAuthored
                    ptrMerged = checklist.ptrMerged
                    ptrRequested = checklist.ptrRequested
                    additionalProperties = checklist.additionalProperties.toMutableMap()
                }

                fun forwardConfirmed(forwardConfirmed: Boolean) =
                    forwardConfirmed(JsonField.of(forwardConfirmed))

                /**
                 * Sets [Builder.forwardConfirmed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.forwardConfirmed] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun forwardConfirmed(forwardConfirmed: JsonField<Boolean>) = apply {
                    this.forwardConfirmed = forwardConfirmed
                }

                fun ptrAuthored(ptrAuthored: Boolean) = ptrAuthored(JsonField.of(ptrAuthored))

                /**
                 * Sets [Builder.ptrAuthored] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ptrAuthored] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ptrAuthored(ptrAuthored: JsonField<Boolean>) = apply {
                    this.ptrAuthored = ptrAuthored
                }

                fun ptrMerged(ptrMerged: Boolean) = ptrMerged(JsonField.of(ptrMerged))

                /**
                 * Sets [Builder.ptrMerged] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ptrMerged] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ptrMerged(ptrMerged: JsonField<Boolean>) = apply { this.ptrMerged = ptrMerged }

                fun ptrRequested(ptrRequested: Boolean) = ptrRequested(JsonField.of(ptrRequested))

                /**
                 * Sets [Builder.ptrRequested] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ptrRequested] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ptrRequested(ptrRequested: JsonField<Boolean>) = apply {
                    this.ptrRequested = ptrRequested
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Checklist].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Checklist =
                    Checklist(
                        forwardConfirmed,
                        ptrAuthored,
                        ptrMerged,
                        ptrRequested,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Checklist = apply {
                if (validated) {
                    return@apply
                }

                forwardConfirmed()
                ptrAuthored()
                ptrMerged()
                ptrRequested()
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
                (if (forwardConfirmed.asKnown().isPresent) 1 else 0) +
                    (if (ptrAuthored.asKnown().isPresent) 1 else 0) +
                    (if (ptrMerged.asKnown().isPresent) 1 else 0) +
                    (if (ptrRequested.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Checklist &&
                    forwardConfirmed == other.forwardConfirmed &&
                    ptrAuthored == other.ptrAuthored &&
                    ptrMerged == other.ptrMerged &&
                    ptrRequested == other.ptrRequested &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    forwardConfirmed,
                    ptrAuthored,
                    ptrMerged,
                    ptrRequested,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Checklist{forwardConfirmed=$forwardConfirmed, ptrAuthored=$ptrAuthored, ptrMerged=$ptrMerged, ptrRequested=$ptrRequested, additionalProperties=$additionalProperties}"
        }

        /**
         * `dns_confirmed`: the PTR is forward-confirmed and `dns_confirmed_at` is set.
         * `pending_ptr`: the PTR record is not yet in place. `pending_dns`: the PTR record is
         * waiting for forward confirmation. `dns_lost`: a previously confirmed PTR no longer
         * confirms, or the PTR request was abandoned before it ever confirmed (`ptr_request_state`
         * is `abandoned`); the IP carries no mail until DNS is confirmed. `not_applicable`: the IP
         * is released or has no PTR record on file.
         */
        class DnsStatus @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val NOT_APPLICABLE = of("not_applicable")

                @JvmField val PENDING_PTR = of("pending_ptr")

                @JvmField val PENDING_DNS = of("pending_dns")

                @JvmField val DNS_CONFIRMED = of("dns_confirmed")

                @JvmField val DNS_LOST = of("dns_lost")

                @JvmStatic fun of(value: String) = DnsStatus(JsonField.of(value))
            }

            /** An enum containing [DnsStatus]'s known values. */
            enum class Known {
                NOT_APPLICABLE,
                PENDING_PTR,
                PENDING_DNS,
                DNS_CONFIRMED,
                DNS_LOST,
            }

            /**
             * An enum containing [DnsStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DnsStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NOT_APPLICABLE,
                PENDING_PTR,
                PENDING_DNS,
                DNS_CONFIRMED,
                DNS_LOST,
                /**
                 * An enum member indicating that [DnsStatus] was instantiated with an unknown
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
                    NOT_APPLICABLE -> Value.NOT_APPLICABLE
                    PENDING_PTR -> Value.PENDING_PTR
                    PENDING_DNS -> Value.PENDING_DNS
                    DNS_CONFIRMED -> Value.DNS_CONFIRMED
                    DNS_LOST -> Value.DNS_LOST
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
                    NOT_APPLICABLE -> Known.NOT_APPLICABLE
                    PENDING_PTR -> Known.PENDING_PTR
                    PENDING_DNS -> Known.PENDING_DNS
                    DNS_CONFIRMED -> Known.DNS_CONFIRMED
                    DNS_LOST -> Known.DNS_LOST
                    else -> throw TelnyxInvalidDataException("Unknown DnsStatus: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): DnsStatus = apply {
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

                return other is DnsStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * State of the Telnyx PTR change: `pending`, `pr_open`, `merged`, `confirmed`, `failed`, or
         * `abandoned`. Informational.
         */
        class PtrRequestState
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

                @JvmField val PENDING = of("pending")

                @JvmField val PR_OPEN = of("pr_open")

                @JvmField val MERGED = of("merged")

                @JvmField val CONFIRMED = of("confirmed")

                @JvmField val FAILED = of("failed")

                @JvmField val ABANDONED = of("abandoned")

                @JvmStatic fun of(value: String) = PtrRequestState(JsonField.of(value))
            }

            /** An enum containing [PtrRequestState]'s known values. */
            enum class Known {
                PENDING,
                PR_OPEN,
                MERGED,
                CONFIRMED,
                FAILED,
                ABANDONED,
            }

            /**
             * An enum containing [PtrRequestState]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PtrRequestState] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                PR_OPEN,
                MERGED,
                CONFIRMED,
                FAILED,
                ABANDONED,
                /**
                 * An enum member indicating that [PtrRequestState] was instantiated with an unknown
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
                    PENDING -> Value.PENDING
                    PR_OPEN -> Value.PR_OPEN
                    MERGED -> Value.MERGED
                    CONFIRMED -> Value.CONFIRMED
                    FAILED -> Value.FAILED
                    ABANDONED -> Value.ABANDONED
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
                    PENDING -> Known.PENDING
                    PR_OPEN -> Known.PR_OPEN
                    MERGED -> Known.MERGED
                    CONFIRMED -> Known.CONFIRMED
                    FAILED -> Known.FAILED
                    ABANDONED -> Known.ABANDONED
                    else -> throw TelnyxInvalidDataException("Unknown PtrRequestState: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PtrRequestState = apply {
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

                return other is PtrRequestState && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Provisioning &&
                checklist == other.checklist &&
                dnsStatus == other.dnsStatus &&
                ptrRequestPrUrl == other.ptrRequestPrUrl &&
                ptrRequestState == other.ptrRequestState &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                checklist,
                dnsStatus,
                ptrRequestPrUrl,
                ptrRequestState,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Provisioning{checklist=$checklist, dnsStatus=$dnsStatus, ptrRequestPrUrl=$ptrRequestPrUrl, ptrRequestState=$ptrRequestState, additionalProperties=$additionalProperties}"
    }

    /** Same value as `provisioning.dns_status`. */
    class ProvisioningStatus
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

            @JvmField val NOT_APPLICABLE = of("not_applicable")

            @JvmField val PENDING_PTR = of("pending_ptr")

            @JvmField val PENDING_DNS = of("pending_dns")

            @JvmField val DNS_CONFIRMED = of("dns_confirmed")

            @JvmField val DNS_LOST = of("dns_lost")

            @JvmStatic fun of(value: String) = ProvisioningStatus(JsonField.of(value))
        }

        /** An enum containing [ProvisioningStatus]'s known values. */
        enum class Known {
            NOT_APPLICABLE,
            PENDING_PTR,
            PENDING_DNS,
            DNS_CONFIRMED,
            DNS_LOST,
        }

        /**
         * An enum containing [ProvisioningStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ProvisioningStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_APPLICABLE,
            PENDING_PTR,
            PENDING_DNS,
            DNS_CONFIRMED,
            DNS_LOST,
            /**
             * An enum member indicating that [ProvisioningStatus] was instantiated with an unknown
             * value.
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
                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                PENDING_PTR -> Value.PENDING_PTR
                PENDING_DNS -> Value.PENDING_DNS
                DNS_CONFIRMED -> Value.DNS_CONFIRMED
                DNS_LOST -> Value.DNS_LOST
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
                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                PENDING_PTR -> Known.PENDING_PTR
                PENDING_DNS -> Known.PENDING_DNS
                DNS_CONFIRMED -> Known.DNS_CONFIRMED
                DNS_LOST -> Known.DNS_LOST
                else -> throw TelnyxInvalidDataException("Unknown ProvisioningStatus: $value")
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
        fun validate(): ProvisioningStatus = apply {
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

            return other is ProvisioningStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            @JvmField val DEDICATED_IP = of("dedicated_ip")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            DEDICATED_IP
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
            DEDICATED_IP,
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
                DEDICATED_IP -> Value.DEDICATED_IP
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
                DEDICATED_IP -> Known.DEDICATED_IP
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

    /**
     * Lifecycle status. `provisioning`: purchased and billed, carries no mail until `start_warmup`.
     * `warming_up`: warm-up ramp in progress. `active`: ramp complete. `suspended`: suspended by
     * Telnyx; carries no mail and is still billed. `released`: returned to Telnyx; carries no mail.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PROVISIONING = of("provisioning")

            @JvmField val WARMING_UP = of("warming_up")

            @JvmField val ACTIVE = of("active")

            @JvmField val SUSPENDED = of("suspended")

            @JvmField val RELEASED = of("released")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PROVISIONING,
            WARMING_UP,
            ACTIVE,
            SUSPENDED,
            RELEASED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PROVISIONING,
            WARMING_UP,
            ACTIVE,
            SUSPENDED,
            RELEASED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PROVISIONING -> Value.PROVISIONING
                WARMING_UP -> Value.WARMING_UP
                ACTIVE -> Value.ACTIVE
                SUSPENDED -> Value.SUSPENDED
                RELEASED -> Value.RELEASED
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
                PROVISIONING -> Known.PROVISIONING
                WARMING_UP -> Known.WARMING_UP
                ACTIVE -> Known.ACTIVE
                SUSPENDED -> Known.SUSPENDED
                RELEASED -> Known.RELEASED
                else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Warmup ramp state for a dedicated IP. */
    class Warmup
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dailyCap: JsonField<Long>,
        private val paused: JsonField<Boolean>,
        private val pausedAt: JsonField<OffsetDateTime>,
        private val progress: JsonField<Long>,
        private val startedAt: JsonField<OffsetDateTime>,
        private val today: JsonField<Today>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("daily_cap") @ExcludeMissing dailyCap: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("paused") @ExcludeMissing paused: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("paused_at")
            @ExcludeMissing
            pausedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("progress") @ExcludeMissing progress: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("started_at")
            @ExcludeMissing
            startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("today") @ExcludeMissing today: JsonField<Today> = JsonMissing.of(),
        ) : this(dailyCap, paused, pausedAt, progress, startedAt, today, mutableMapOf())

        /**
         * Daily cap of the current ramp stage. Null until the scheduler arms the first stage, and
         * cleared when the ramp completes, automatically or through `complete_warmup`. On an
         * `active` IP this value is informational and can keep an earlier stage cap after a
         * suspension is lifted; it does not limit sending.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dailyCap(): Optional<Long> = dailyCap.getOptional("daily_cap")

        /**
         * True while the ramp is paused.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paused(): Optional<Boolean> = paused.getOptional("paused")

        /**
         * When the ramp was paused. Null when not paused.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun pausedAt(): Optional<OffsetDateTime> = pausedAt.getOptional("paused_at")

        /**
         * Ramp progress (0-100): the share of the 28 send-day schedule completed. Only UTC days on
         * which the IP sent mail count. Set to 100 when the ramp completes, automatically or
         * through `complete_warmup`. On an `active` IP this value is informational and can keep an
         * earlier value after a suspension is lifted.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun progress(): Optional<Long> = progress.getOptional("progress")

        /**
         * When `start_warmup` was called. Null before warm-up starts and after release.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startedAt(): Optional<OffsetDateTime> = startedAt.getOptional("started_at")

        /**
         * Today's warmup allowance report card (current UTC day). Null outside the warmup window
         * (before start_warmup, after release/suspension). `active` IPs report the ramp-complete
         * allowance, except as described for `cap`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun today(): Optional<Today> = today.getOptional("today")

        /**
         * Returns the raw JSON value of [dailyCap].
         *
         * Unlike [dailyCap], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("daily_cap") @ExcludeMissing fun _dailyCap(): JsonField<Long> = dailyCap

        /**
         * Returns the raw JSON value of [paused].
         *
         * Unlike [paused], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paused") @ExcludeMissing fun _paused(): JsonField<Boolean> = paused

        /**
         * Returns the raw JSON value of [pausedAt].
         *
         * Unlike [pausedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paused_at")
        @ExcludeMissing
        fun _pausedAt(): JsonField<OffsetDateTime> = pausedAt

        /**
         * Returns the raw JSON value of [progress].
         *
         * Unlike [progress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("progress") @ExcludeMissing fun _progress(): JsonField<Long> = progress

        /**
         * Returns the raw JSON value of [startedAt].
         *
         * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("started_at")
        @ExcludeMissing
        fun _startedAt(): JsonField<OffsetDateTime> = startedAt

        /**
         * Returns the raw JSON value of [today].
         *
         * Unlike [today], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("today") @ExcludeMissing fun _today(): JsonField<Today> = today

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

            /** Returns a mutable builder for constructing an instance of [Warmup]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Warmup]. */
        class Builder internal constructor() {

            private var dailyCap: JsonField<Long> = JsonMissing.of()
            private var paused: JsonField<Boolean> = JsonMissing.of()
            private var pausedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var progress: JsonField<Long> = JsonMissing.of()
            private var startedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var today: JsonField<Today> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(warmup: Warmup) = apply {
                dailyCap = warmup.dailyCap
                paused = warmup.paused
                pausedAt = warmup.pausedAt
                progress = warmup.progress
                startedAt = warmup.startedAt
                today = warmup.today
                additionalProperties = warmup.additionalProperties.toMutableMap()
            }

            /**
             * Daily cap of the current ramp stage. Null until the scheduler arms the first stage,
             * and cleared when the ramp completes, automatically or through `complete_warmup`. On
             * an `active` IP this value is informational and can keep an earlier stage cap after a
             * suspension is lifted; it does not limit sending.
             */
            fun dailyCap(dailyCap: Long?) = dailyCap(JsonField.ofNullable(dailyCap))

            /**
             * Alias for [Builder.dailyCap].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun dailyCap(dailyCap: Long) = dailyCap(dailyCap as Long?)

            /** Alias for calling [Builder.dailyCap] with `dailyCap.orElse(null)`. */
            fun dailyCap(dailyCap: Optional<Long>) = dailyCap(dailyCap.getOrNull())

            /**
             * Sets [Builder.dailyCap] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailyCap] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dailyCap(dailyCap: JsonField<Long>) = apply { this.dailyCap = dailyCap }

            /** True while the ramp is paused. */
            fun paused(paused: Boolean) = paused(JsonField.of(paused))

            /**
             * Sets [Builder.paused] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paused] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paused(paused: JsonField<Boolean>) = apply { this.paused = paused }

            /** When the ramp was paused. Null when not paused. */
            fun pausedAt(pausedAt: OffsetDateTime?) = pausedAt(JsonField.ofNullable(pausedAt))

            /** Alias for calling [Builder.pausedAt] with `pausedAt.orElse(null)`. */
            fun pausedAt(pausedAt: Optional<OffsetDateTime>) = pausedAt(pausedAt.getOrNull())

            /**
             * Sets [Builder.pausedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pausedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pausedAt(pausedAt: JsonField<OffsetDateTime>) = apply { this.pausedAt = pausedAt }

            /**
             * Ramp progress (0-100): the share of the 28 send-day schedule completed. Only UTC days
             * on which the IP sent mail count. Set to 100 when the ramp completes, automatically or
             * through `complete_warmup`. On an `active` IP this value is informational and can keep
             * an earlier value after a suspension is lifted.
             */
            fun progress(progress: Long) = progress(JsonField.of(progress))

            /**
             * Sets [Builder.progress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.progress] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun progress(progress: JsonField<Long>) = apply { this.progress = progress }

            /** When `start_warmup` was called. Null before warm-up starts and after release. */
            fun startedAt(startedAt: OffsetDateTime?) = startedAt(JsonField.ofNullable(startedAt))

            /** Alias for calling [Builder.startedAt] with `startedAt.orElse(null)`. */
            fun startedAt(startedAt: Optional<OffsetDateTime>) = startedAt(startedAt.getOrNull())

            /**
             * Sets [Builder.startedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply {
                this.startedAt = startedAt
            }

            /**
             * Today's warmup allowance report card (current UTC day). Null outside the warmup
             * window (before start_warmup, after release/suspension). `active` IPs report the
             * ramp-complete allowance, except as described for `cap`.
             */
            fun today(today: Today?) = today(JsonField.ofNullable(today))

            /** Alias for calling [Builder.today] with `today.orElse(null)`. */
            fun today(today: Optional<Today>) = today(today.getOrNull())

            /**
             * Sets [Builder.today] to an arbitrary JSON value.
             *
             * You should usually call [Builder.today] with a well-typed [Today] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun today(today: JsonField<Today>) = apply { this.today = today }

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
             * Returns an immutable instance of [Warmup].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Warmup =
                Warmup(
                    dailyCap,
                    paused,
                    pausedAt,
                    progress,
                    startedAt,
                    today,
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
        fun validate(): Warmup = apply {
            if (validated) {
                return@apply
            }

            dailyCap()
            paused()
            pausedAt()
            progress()
            startedAt()
            today().ifPresent { it.validate() }
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
            (if (dailyCap.asKnown().isPresent) 1 else 0) +
                (if (paused.asKnown().isPresent) 1 else 0) +
                (if (pausedAt.asKnown().isPresent) 1 else 0) +
                (if (progress.asKnown().isPresent) 1 else 0) +
                (if (startedAt.asKnown().isPresent) 1 else 0) +
                (today.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Today's warmup allowance report card (current UTC day). Null outside the warmup window
         * (before start_warmup, after release/suspension). `active` IPs report the ramp-complete
         * allowance, except as described for `cap`.
         */
        class Today
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cap: JsonField<Long>,
            private val day: JsonField<LocalDate>,
            private val granted: JsonField<Long>,
            private val remaining: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cap") @ExcludeMissing cap: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("day") @ExcludeMissing day: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("granted")
                @ExcludeMissing
                granted: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("remaining")
                @ExcludeMissing
                remaining: JsonField<Long> = JsonMissing.of(),
            ) : this(cap, day, granted, remaining, mutableMapOf())

            /**
             * The day's allowance cap. Null when the ramp has not opened yet (day 0: the scheduler
             * has not armed a stage cap) — distinct from a spent day, which reports the cap with
             * remaining 0. `active` IPs report `100000000`, the ramp-complete cap;
             * `complete_warmup` applies it to the current day immediately. A day's allowance
             * created before the IP became `active` can keep its stored `cap` and `remaining` until
             * the next first-attempt send refreshes them.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun cap(): Optional<Long> = cap.getOptional("cap")

            /**
             * The UTC day this snapshot describes (warmup caps reset at UTC midnight).
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun day(): Optional<LocalDate> = day.getOptional("day")

            /**
             * First-attempt sends released from warmup hold so far today. Delivery retries never
             * lease allowance and are not counted.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun granted(): Optional<Long> = granted.getOptional("granted")

            /**
             * Headroom left today. A queued send held by the daily cap is explained by remaining ==
             * 0; null mirrors cap (ramp not open yet). On an `active` IP whose `cap` is below
             * `100000000`, remaining == 0 is a stored allowance and does not block the next
             * eligible first-attempt send.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun remaining(): Optional<Long> = remaining.getOptional("remaining")

            /**
             * Returns the raw JSON value of [cap].
             *
             * Unlike [cap], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cap") @ExcludeMissing fun _cap(): JsonField<Long> = cap

            /**
             * Returns the raw JSON value of [day].
             *
             * Unlike [day], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("day") @ExcludeMissing fun _day(): JsonField<LocalDate> = day

            /**
             * Returns the raw JSON value of [granted].
             *
             * Unlike [granted], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("granted") @ExcludeMissing fun _granted(): JsonField<Long> = granted

            /**
             * Returns the raw JSON value of [remaining].
             *
             * Unlike [remaining], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("remaining") @ExcludeMissing fun _remaining(): JsonField<Long> = remaining

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

                /** Returns a mutable builder for constructing an instance of [Today]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Today]. */
            class Builder internal constructor() {

                private var cap: JsonField<Long> = JsonMissing.of()
                private var day: JsonField<LocalDate> = JsonMissing.of()
                private var granted: JsonField<Long> = JsonMissing.of()
                private var remaining: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(today: Today) = apply {
                    cap = today.cap
                    day = today.day
                    granted = today.granted
                    remaining = today.remaining
                    additionalProperties = today.additionalProperties.toMutableMap()
                }

                /**
                 * The day's allowance cap. Null when the ramp has not opened yet (day 0: the
                 * scheduler has not armed a stage cap) — distinct from a spent day, which reports
                 * the cap with remaining 0. `active` IPs report `100000000`, the ramp-complete cap;
                 * `complete_warmup` applies it to the current day immediately. A day's allowance
                 * created before the IP became `active` can keep its stored `cap` and `remaining`
                 * until the next first-attempt send refreshes them.
                 */
                fun cap(cap: Long?) = cap(JsonField.ofNullable(cap))

                /**
                 * Alias for [Builder.cap].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun cap(cap: Long) = cap(cap as Long?)

                /** Alias for calling [Builder.cap] with `cap.orElse(null)`. */
                fun cap(cap: Optional<Long>) = cap(cap.getOrNull())

                /**
                 * Sets [Builder.cap] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cap] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cap(cap: JsonField<Long>) = apply { this.cap = cap }

                /** The UTC day this snapshot describes (warmup caps reset at UTC midnight). */
                fun day(day: LocalDate) = day(JsonField.of(day))

                /**
                 * Sets [Builder.day] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.day] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun day(day: JsonField<LocalDate>) = apply { this.day = day }

                /**
                 * First-attempt sends released from warmup hold so far today. Delivery retries
                 * never lease allowance and are not counted.
                 */
                fun granted(granted: Long) = granted(JsonField.of(granted))

                /**
                 * Sets [Builder.granted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.granted] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun granted(granted: JsonField<Long>) = apply { this.granted = granted }

                /**
                 * Headroom left today. A queued send held by the daily cap is explained by
                 * remaining == 0; null mirrors cap (ramp not open yet). On an `active` IP whose
                 * `cap` is below `100000000`, remaining == 0 is a stored allowance and does not
                 * block the next eligible first-attempt send.
                 */
                fun remaining(remaining: Long?) = remaining(JsonField.ofNullable(remaining))

                /**
                 * Alias for [Builder.remaining].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun remaining(remaining: Long) = remaining(remaining as Long?)

                /** Alias for calling [Builder.remaining] with `remaining.orElse(null)`. */
                fun remaining(remaining: Optional<Long>) = remaining(remaining.getOrNull())

                /**
                 * Sets [Builder.remaining] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remaining] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun remaining(remaining: JsonField<Long>) = apply { this.remaining = remaining }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Today].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Today =
                    Today(cap, day, granted, remaining, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): Today = apply {
                if (validated) {
                    return@apply
                }

                cap()
                day()
                granted()
                remaining()
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
                (if (cap.asKnown().isPresent) 1 else 0) +
                    (if (day.asKnown().isPresent) 1 else 0) +
                    (if (granted.asKnown().isPresent) 1 else 0) +
                    (if (remaining.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Today &&
                    cap == other.cap &&
                    day == other.day &&
                    granted == other.granted &&
                    remaining == other.remaining &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(cap, day, granted, remaining, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Today{cap=$cap, day=$day, granted=$granted, remaining=$remaining, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Warmup &&
                dailyCap == other.dailyCap &&
                paused == other.paused &&
                pausedAt == other.pausedAt &&
                progress == other.progress &&
                startedAt == other.startedAt &&
                today == other.today &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dailyCap,
                paused,
                pausedAt,
                progress,
                startedAt,
                today,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Warmup{dailyCap=$dailyCap, paused=$paused, pausedAt=$pausedAt, progress=$progress, startedAt=$startedAt, today=$today, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DedicatedIp &&
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
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DedicatedIp{id=$id, billing=$billing, createdAt=$createdAt, dnsConfirmedAt=$dnsConfirmedAt, ipAddress=$ipAddress, ipVersion=$ipVersion, poolId=$poolId, provisioning=$provisioning, provisioningStatus=$provisioningStatus, ptrHostname=$ptrHostname, quarantineUntil=$quarantineUntil, recordType=$recordType, region=$region, releasedAt=$releasedAt, status=$status, suspensionReason=$suspensionReason, updatedAt=$updatedAt, warmup=$warmup, additionalProperties=$additionalProperties}"
}
