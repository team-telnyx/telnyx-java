// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class EmailDomain
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dkim: JsonField<Dkim>,
    private val dmarcPolicy: JsonField<EmailDmarcPolicy>,
    private val dnsRecords: JsonField<List<DnsRecord>>,
    private val domain: JsonField<String>,
    private val inbound: JsonField<Inbound>,
    private val recordType: JsonField<RecordType>,
    private val status: JsonField<EmailDomainStatus>,
    private val tracking: JsonField<DomainsTrackingSettings>,
    private val type: JsonField<EmailDomainType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val usableForInbound: JsonField<Boolean>,
    private val usableForSending: JsonField<Boolean>,
    private val verification: JsonField<EmailDomainVerification>,
    private val reputation: JsonField<Reputation>,
    private val verifiedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dkim") @ExcludeMissing dkim: JsonField<Dkim> = JsonMissing.of(),
        @JsonProperty("dmarc_policy")
        @ExcludeMissing
        dmarcPolicy: JsonField<EmailDmarcPolicy> = JsonMissing.of(),
        @JsonProperty("dns_records")
        @ExcludeMissing
        dnsRecords: JsonField<List<DnsRecord>> = JsonMissing.of(),
        @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inbound") @ExcludeMissing inbound: JsonField<Inbound> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<EmailDomainStatus> = JsonMissing.of(),
        @JsonProperty("tracking")
        @ExcludeMissing
        tracking: JsonField<DomainsTrackingSettings> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<EmailDomainType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("usable_for_inbound")
        @ExcludeMissing
        usableForInbound: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("usable_for_sending")
        @ExcludeMissing
        usableForSending: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("verification")
        @ExcludeMissing
        verification: JsonField<EmailDomainVerification> = JsonMissing.of(),
        @JsonProperty("reputation")
        @ExcludeMissing
        reputation: JsonField<Reputation> = JsonMissing.of(),
        @JsonProperty("verified_at")
        @ExcludeMissing
        verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        dkim,
        dmarcPolicy,
        dnsRecords,
        domain,
        inbound,
        recordType,
        status,
        tracking,
        type,
        updatedAt,
        usableForInbound,
        usableForSending,
        verification,
        reputation,
        verifiedAt,
        mutableMapOf(),
    )

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dkim(): Dkim = dkim.getRequired("dkim")

    /**
     * DMARC policy for a sending domain. Drives the recommended _dmarc.<domain> TXT record. DMARC
     * is advisory and never blocks sending. When omitted or null, the domain uses the advisory
     * default (v=DMARC1; p=none; rua=mailto:dmarc@telnyx.com).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dmarcPolicy(): Optional<EmailDmarcPolicy> = dmarcPolicy.getOptional("dmarc_policy")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dnsRecords(): List<DnsRecord> = dnsRecords.getRequired("dns_records")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun domain(): String = domain.getRequired("domain")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inbound(): Inbound = inbound.getRequired("inbound")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordType(): RecordType = recordType.getRequired("record_type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): EmailDomainStatus = status.getRequired("status")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tracking(): DomainsTrackingSettings = tracking.getRequired("tracking")

    /**
     * Domain type. `custom` domains are account-owned (BYOD). `shared` domains are Telnyx-managed,
     * visible to and usable by ALL accounts for sending, but read-only: only the owning (system)
     * account may modify, verify, or delete them; other accounts receive 403 (code 10008).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): EmailDomainType = type.getRequired("type")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usableForInbound(): Boolean = usableForInbound.getRequired("usable_for_inbound")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usableForSending(): Boolean = usableForSending.getRequired("usable_for_sending")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verification(): EmailDomainVerification = verification.getRequired("verification")

    /**
     * Sender reputation for this domain (present on all domain responses).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reputation(): Optional<Reputation> = reputation.getOptional("reputation")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verifiedAt(): Optional<OffsetDateTime> = verifiedAt.getOptional("verified_at")

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
     * Returns the raw JSON value of [dkim].
     *
     * Unlike [dkim], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dkim") @ExcludeMissing fun _dkim(): JsonField<Dkim> = dkim

    /**
     * Returns the raw JSON value of [dmarcPolicy].
     *
     * Unlike [dmarcPolicy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dmarc_policy")
    @ExcludeMissing
    fun _dmarcPolicy(): JsonField<EmailDmarcPolicy> = dmarcPolicy

    /**
     * Returns the raw JSON value of [dnsRecords].
     *
     * Unlike [dnsRecords], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dns_records")
    @ExcludeMissing
    fun _dnsRecords(): JsonField<List<DnsRecord>> = dnsRecords

    /**
     * Returns the raw JSON value of [domain].
     *
     * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

    /**
     * Returns the raw JSON value of [inbound].
     *
     * Unlike [inbound], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inbound") @ExcludeMissing fun _inbound(): JsonField<Inbound> = inbound

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<EmailDomainStatus> = status

    /**
     * Returns the raw JSON value of [tracking].
     *
     * Unlike [tracking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracking")
    @ExcludeMissing
    fun _tracking(): JsonField<DomainsTrackingSettings> = tracking

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<EmailDomainType> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [usableForInbound].
     *
     * Unlike [usableForInbound], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usable_for_inbound")
    @ExcludeMissing
    fun _usableForInbound(): JsonField<Boolean> = usableForInbound

    /**
     * Returns the raw JSON value of [usableForSending].
     *
     * Unlike [usableForSending], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usable_for_sending")
    @ExcludeMissing
    fun _usableForSending(): JsonField<Boolean> = usableForSending

    /**
     * Returns the raw JSON value of [verification].
     *
     * Unlike [verification], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verification")
    @ExcludeMissing
    fun _verification(): JsonField<EmailDomainVerification> = verification

    /**
     * Returns the raw JSON value of [reputation].
     *
     * Unlike [reputation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reputation")
    @ExcludeMissing
    fun _reputation(): JsonField<Reputation> = reputation

    /**
     * Returns the raw JSON value of [verifiedAt].
     *
     * Unlike [verifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verified_at")
    @ExcludeMissing
    fun _verifiedAt(): JsonField<OffsetDateTime> = verifiedAt

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
         * Returns a mutable builder for constructing an instance of [EmailDomain].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .dkim()
         * .dmarcPolicy()
         * .dnsRecords()
         * .domain()
         * .inbound()
         * .recordType()
         * .status()
         * .tracking()
         * .type()
         * .updatedAt()
         * .usableForInbound()
         * .usableForSending()
         * .verification()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailDomain]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dkim: JsonField<Dkim>? = null
        private var dmarcPolicy: JsonField<EmailDmarcPolicy>? = null
        private var dnsRecords: JsonField<MutableList<DnsRecord>>? = null
        private var domain: JsonField<String>? = null
        private var inbound: JsonField<Inbound>? = null
        private var recordType: JsonField<RecordType>? = null
        private var status: JsonField<EmailDomainStatus>? = null
        private var tracking: JsonField<DomainsTrackingSettings>? = null
        private var type: JsonField<EmailDomainType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var usableForInbound: JsonField<Boolean>? = null
        private var usableForSending: JsonField<Boolean>? = null
        private var verification: JsonField<EmailDomainVerification>? = null
        private var reputation: JsonField<Reputation> = JsonMissing.of()
        private var verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailDomain: EmailDomain) = apply {
            id = emailDomain.id
            createdAt = emailDomain.createdAt
            dkim = emailDomain.dkim
            dmarcPolicy = emailDomain.dmarcPolicy
            dnsRecords = emailDomain.dnsRecords.map { it.toMutableList() }
            domain = emailDomain.domain
            inbound = emailDomain.inbound
            recordType = emailDomain.recordType
            status = emailDomain.status
            tracking = emailDomain.tracking
            type = emailDomain.type
            updatedAt = emailDomain.updatedAt
            usableForInbound = emailDomain.usableForInbound
            usableForSending = emailDomain.usableForSending
            verification = emailDomain.verification
            reputation = emailDomain.reputation
            verifiedAt = emailDomain.verifiedAt
            additionalProperties = emailDomain.additionalProperties.toMutableMap()
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

        fun dkim(dkim: Dkim) = dkim(JsonField.of(dkim))

        /**
         * Sets [Builder.dkim] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dkim] with a well-typed [Dkim] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dkim(dkim: JsonField<Dkim>) = apply { this.dkim = dkim }

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
         * You should usually call [Builder.dmarcPolicy] with a well-typed [EmailDmarcPolicy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dmarcPolicy(dmarcPolicy: JsonField<EmailDmarcPolicy>) = apply {
            this.dmarcPolicy = dmarcPolicy
        }

        fun dnsRecords(dnsRecords: List<DnsRecord>) = dnsRecords(JsonField.of(dnsRecords))

        /**
         * Sets [Builder.dnsRecords] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dnsRecords] with a well-typed `List<DnsRecord>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dnsRecords(dnsRecords: JsonField<List<DnsRecord>>) = apply {
            this.dnsRecords = dnsRecords.map { it.toMutableList() }
        }

        /**
         * Adds a single [DnsRecord] to [dnsRecords].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDnsRecord(dnsRecord: DnsRecord) = apply {
            dnsRecords =
                (dnsRecords ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dnsRecords", it).add(dnsRecord)
                }
        }

        fun domain(domain: String) = domain(JsonField.of(domain))

        /**
         * Sets [Builder.domain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domain] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun domain(domain: JsonField<String>) = apply { this.domain = domain }

        fun inbound(inbound: Inbound) = inbound(JsonField.of(inbound))

        /**
         * Sets [Builder.inbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inbound] with a well-typed [Inbound] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inbound(inbound: JsonField<Inbound>) = apply { this.inbound = inbound }

        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        fun status(status: EmailDomainStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [EmailDomainStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<EmailDomainStatus>) = apply { this.status = status }

        fun tracking(tracking: DomainsTrackingSettings) = tracking(JsonField.of(tracking))

        /**
         * Sets [Builder.tracking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tracking] with a well-typed [DomainsTrackingSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tracking(tracking: JsonField<DomainsTrackingSettings>) = apply {
            this.tracking = tracking
        }

        /**
         * Domain type. `custom` domains are account-owned (BYOD). `shared` domains are
         * Telnyx-managed, visible to and usable by ALL accounts for sending, but read-only: only
         * the owning (system) account may modify, verify, or delete them; other accounts receive
         * 403 (code 10008).
         */
        fun type(type: EmailDomainType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [EmailDomainType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<EmailDomainType>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun usableForInbound(usableForInbound: Boolean) =
            usableForInbound(JsonField.of(usableForInbound))

        /**
         * Sets [Builder.usableForInbound] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usableForInbound] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usableForInbound(usableForInbound: JsonField<Boolean>) = apply {
            this.usableForInbound = usableForInbound
        }

        fun usableForSending(usableForSending: Boolean) =
            usableForSending(JsonField.of(usableForSending))

        /**
         * Sets [Builder.usableForSending] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usableForSending] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usableForSending(usableForSending: JsonField<Boolean>) = apply {
            this.usableForSending = usableForSending
        }

        fun verification(verification: EmailDomainVerification) =
            verification(JsonField.of(verification))

        /**
         * Sets [Builder.verification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verification] with a well-typed
         * [EmailDomainVerification] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun verification(verification: JsonField<EmailDomainVerification>) = apply {
            this.verification = verification
        }

        /** Sender reputation for this domain (present on all domain responses). */
        fun reputation(reputation: Reputation) = reputation(JsonField.of(reputation))

        /**
         * Sets [Builder.reputation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reputation] with a well-typed [Reputation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reputation(reputation: JsonField<Reputation>) = apply { this.reputation = reputation }

        fun verifiedAt(verifiedAt: OffsetDateTime?) = verifiedAt(JsonField.ofNullable(verifiedAt))

        /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
        fun verifiedAt(verifiedAt: Optional<OffsetDateTime>) = verifiedAt(verifiedAt.getOrNull())

        /**
         * Sets [Builder.verifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun verifiedAt(verifiedAt: JsonField<OffsetDateTime>) = apply {
            this.verifiedAt = verifiedAt
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
         * Returns an immutable instance of [EmailDomain].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .dkim()
         * .dmarcPolicy()
         * .dnsRecords()
         * .domain()
         * .inbound()
         * .recordType()
         * .status()
         * .tracking()
         * .type()
         * .updatedAt()
         * .usableForInbound()
         * .usableForSending()
         * .verification()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailDomain =
            EmailDomain(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("dkim", dkim),
                checkRequired("dmarcPolicy", dmarcPolicy),
                checkRequired("dnsRecords", dnsRecords).map { it.toImmutable() },
                checkRequired("domain", domain),
                checkRequired("inbound", inbound),
                checkRequired("recordType", recordType),
                checkRequired("status", status),
                checkRequired("tracking", tracking),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                checkRequired("usableForInbound", usableForInbound),
                checkRequired("usableForSending", usableForSending),
                checkRequired("verification", verification),
                reputation,
                verifiedAt,
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
    fun validate(): EmailDomain = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        dkim().validate()
        dmarcPolicy().ifPresent { it.validate() }
        dnsRecords().forEach { it.validate() }
        domain()
        inbound().validate()
        recordType().validate()
        status().validate()
        tracking().validate()
        type().validate()
        updatedAt()
        usableForInbound()
        usableForSending()
        verification().validate()
        reputation().ifPresent { it.validate() }
        verifiedAt()
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
            (dkim.asKnown().getOrNull()?.validity() ?: 0) +
            (dmarcPolicy.asKnown().getOrNull()?.validity() ?: 0) +
            (dnsRecords.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (domain.asKnown().isPresent) 1 else 0) +
            (inbound.asKnown().getOrNull()?.validity() ?: 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (tracking.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (usableForInbound.asKnown().isPresent) 1 else 0) +
            (if (usableForSending.asKnown().isPresent) 1 else 0) +
            (verification.asKnown().getOrNull()?.validity() ?: 0) +
            (reputation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (verifiedAt.asKnown().isPresent) 1 else 0)

    class Dkim
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val active: JsonField<Boolean>,
        private val algorithm: JsonField<Algorithm>,
        private val keyLength: JsonField<KeyLength>,
        private val rotatedAt: JsonField<OffsetDateTime>,
        private val selector: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("algorithm")
            @ExcludeMissing
            algorithm: JsonField<Algorithm> = JsonMissing.of(),
            @JsonProperty("key_length")
            @ExcludeMissing
            keyLength: JsonField<KeyLength> = JsonMissing.of(),
            @JsonProperty("rotated_at")
            @ExcludeMissing
            rotatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("selector") @ExcludeMissing selector: JsonField<String> = JsonMissing.of(),
        ) : this(active, algorithm, keyLength, rotatedAt, selector, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun active(): Boolean = active.getRequired("active")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun algorithm(): Optional<Algorithm> = algorithm.getOptional("algorithm")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keyLength(): Optional<KeyLength> = keyLength.getOptional("key_length")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rotatedAt(): Optional<OffsetDateTime> = rotatedAt.getOptional("rotated_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun selector(): Optional<String> = selector.getOptional("selector")

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [algorithm].
         *
         * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("algorithm")
        @ExcludeMissing
        fun _algorithm(): JsonField<Algorithm> = algorithm

        /**
         * Returns the raw JSON value of [keyLength].
         *
         * Unlike [keyLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key_length")
        @ExcludeMissing
        fun _keyLength(): JsonField<KeyLength> = keyLength

        /**
         * Returns the raw JSON value of [rotatedAt].
         *
         * Unlike [rotatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rotated_at")
        @ExcludeMissing
        fun _rotatedAt(): JsonField<OffsetDateTime> = rotatedAt

        /**
         * Returns the raw JSON value of [selector].
         *
         * Unlike [selector], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("selector") @ExcludeMissing fun _selector(): JsonField<String> = selector

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
             * Returns a mutable builder for constructing an instance of [Dkim].
             *
             * The following fields are required:
             * ```java
             * .active()
             * .algorithm()
             * .keyLength()
             * .rotatedAt()
             * .selector()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Dkim]. */
        class Builder internal constructor() {

            private var active: JsonField<Boolean>? = null
            private var algorithm: JsonField<Algorithm>? = null
            private var keyLength: JsonField<KeyLength>? = null
            private var rotatedAt: JsonField<OffsetDateTime>? = null
            private var selector: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dkim: Dkim) = apply {
                active = dkim.active
                algorithm = dkim.algorithm
                keyLength = dkim.keyLength
                rotatedAt = dkim.rotatedAt
                selector = dkim.selector
                additionalProperties = dkim.additionalProperties.toMutableMap()
            }

            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun algorithm(algorithm: Algorithm?) = algorithm(JsonField.ofNullable(algorithm))

            /** Alias for calling [Builder.algorithm] with `algorithm.orElse(null)`. */
            fun algorithm(algorithm: Optional<Algorithm>) = algorithm(algorithm.getOrNull())

            /**
             * Sets [Builder.algorithm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.algorithm] with a well-typed [Algorithm] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun algorithm(algorithm: JsonField<Algorithm>) = apply { this.algorithm = algorithm }

            fun keyLength(keyLength: KeyLength?) = keyLength(JsonField.ofNullable(keyLength))

            /** Alias for calling [Builder.keyLength] with `keyLength.orElse(null)`. */
            fun keyLength(keyLength: Optional<KeyLength>) = keyLength(keyLength.getOrNull())

            /**
             * Sets [Builder.keyLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyLength] with a well-typed [KeyLength] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyLength(keyLength: JsonField<KeyLength>) = apply { this.keyLength = keyLength }

            fun rotatedAt(rotatedAt: OffsetDateTime?) = rotatedAt(JsonField.ofNullable(rotatedAt))

            /** Alias for calling [Builder.rotatedAt] with `rotatedAt.orElse(null)`. */
            fun rotatedAt(rotatedAt: Optional<OffsetDateTime>) = rotatedAt(rotatedAt.getOrNull())

            /**
             * Sets [Builder.rotatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rotatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rotatedAt(rotatedAt: JsonField<OffsetDateTime>) = apply {
                this.rotatedAt = rotatedAt
            }

            fun selector(selector: String?) = selector(JsonField.ofNullable(selector))

            /** Alias for calling [Builder.selector] with `selector.orElse(null)`. */
            fun selector(selector: Optional<String>) = selector(selector.getOrNull())

            /**
             * Sets [Builder.selector] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selector] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun selector(selector: JsonField<String>) = apply { this.selector = selector }

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
             * Returns an immutable instance of [Dkim].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .active()
             * .algorithm()
             * .keyLength()
             * .rotatedAt()
             * .selector()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Dkim =
                Dkim(
                    checkRequired("active", active),
                    checkRequired("algorithm", algorithm),
                    checkRequired("keyLength", keyLength),
                    checkRequired("rotatedAt", rotatedAt),
                    checkRequired("selector", selector),
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
        fun validate(): Dkim = apply {
            if (validated) {
                return@apply
            }

            active()
            algorithm().ifPresent { it.validate() }
            keyLength().ifPresent { it.validate() }
            rotatedAt()
            selector()
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
            (if (active.asKnown().isPresent) 1 else 0) +
                (algorithm.asKnown().getOrNull()?.validity() ?: 0) +
                (keyLength.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rotatedAt.asKnown().isPresent) 1 else 0) +
                (if (selector.asKnown().isPresent) 1 else 0)

        class Algorithm @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val RSA_SHA256 = of("rsa-sha256")

                @JvmStatic fun of(value: String) = Algorithm(JsonField.of(value))
            }

            /** An enum containing [Algorithm]'s known values. */
            enum class Known {
                RSA_SHA256
            }

            /**
             * An enum containing [Algorithm]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Algorithm] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RSA_SHA256,
                /**
                 * An enum member indicating that [Algorithm] was instantiated with an unknown
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
                    RSA_SHA256 -> Value.RSA_SHA256
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
                    RSA_SHA256 -> Known.RSA_SHA256
                    else -> throw TelnyxInvalidDataException("Unknown Algorithm: $value")
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
            fun validate(): Algorithm = apply {
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

                return other is Algorithm && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class KeyLength @JsonCreator private constructor(private val value: JsonField<Long>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Long> = value

            companion object {

                @JvmField val _2048 = of(2048L)

                @JvmStatic fun of(value: Long) = KeyLength(JsonField.of(value))
            }

            /** An enum containing [KeyLength]'s known values. */
            enum class Known {
                _2048
            }

            /**
             * An enum containing [KeyLength]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [KeyLength] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _2048,
                /**
                 * An enum member indicating that [KeyLength] was instantiated with an unknown
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
                    _2048 -> Value._2048
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
                    _2048 -> Known._2048
                    else -> throw TelnyxInvalidDataException("Unknown KeyLength: $value")
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
            fun validate(): KeyLength = apply {
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

                return other is KeyLength && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dkim &&
                active == other.active &&
                algorithm == other.algorithm &&
                keyLength == other.keyLength &&
                rotatedAt == other.rotatedAt &&
                selector == other.selector &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(active, algorithm, keyLength, rotatedAt, selector, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Dkim{active=$active, algorithm=$algorithm, keyLength=$keyLength, rotatedAt=$rotatedAt, selector=$selector, additionalProperties=$additionalProperties}"
    }

    class Inbound
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val catchAll: JsonField<Boolean>,
        private val enabled: JsonField<Boolean>,
        private val mxRequired: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("catch_all")
            @ExcludeMissing
            catchAll: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("mx_required")
            @ExcludeMissing
            mxRequired: JsonField<Boolean> = JsonMissing.of(),
        ) : this(catchAll, enabled, mxRequired, mutableMapOf())

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun catchAll(): Boolean = catchAll.getRequired("catch_all")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun enabled(): Boolean = enabled.getRequired("enabled")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mxRequired(): Boolean = mxRequired.getRequired("mx_required")

        /**
         * Returns the raw JSON value of [catchAll].
         *
         * Unlike [catchAll], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("catch_all") @ExcludeMissing fun _catchAll(): JsonField<Boolean> = catchAll

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [mxRequired].
         *
         * Unlike [mxRequired], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mx_required")
        @ExcludeMissing
        fun _mxRequired(): JsonField<Boolean> = mxRequired

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
             * Returns a mutable builder for constructing an instance of [Inbound].
             *
             * The following fields are required:
             * ```java
             * .catchAll()
             * .enabled()
             * .mxRequired()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inbound]. */
        class Builder internal constructor() {

            private var catchAll: JsonField<Boolean>? = null
            private var enabled: JsonField<Boolean>? = null
            private var mxRequired: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inbound: Inbound) = apply {
                catchAll = inbound.catchAll
                enabled = inbound.enabled
                mxRequired = inbound.mxRequired
                additionalProperties = inbound.additionalProperties.toMutableMap()
            }

            fun catchAll(catchAll: Boolean) = catchAll(JsonField.of(catchAll))

            /**
             * Sets [Builder.catchAll] to an arbitrary JSON value.
             *
             * You should usually call [Builder.catchAll] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun catchAll(catchAll: JsonField<Boolean>) = apply { this.catchAll = catchAll }

            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            fun mxRequired(mxRequired: Boolean) = mxRequired(JsonField.of(mxRequired))

            /**
             * Sets [Builder.mxRequired] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mxRequired] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mxRequired(mxRequired: JsonField<Boolean>) = apply { this.mxRequired = mxRequired }

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
             *
             * The following fields are required:
             * ```java
             * .catchAll()
             * .enabled()
             * .mxRequired()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Inbound =
                Inbound(
                    checkRequired("catchAll", catchAll),
                    checkRequired("enabled", enabled),
                    checkRequired("mxRequired", mxRequired),
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
        fun validate(): Inbound = apply {
            if (validated) {
                return@apply
            }

            catchAll()
            enabled()
            mxRequired()
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
            (if (catchAll.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (mxRequired.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Inbound &&
                catchAll == other.catchAll &&
                enabled == other.enabled &&
                mxRequired == other.mxRequired &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(catchAll, enabled, mxRequired, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Inbound{catchAll=$catchAll, enabled=$enabled, mxRequired=$mxRequired, additionalProperties=$additionalProperties}"
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

            @JvmField val EMAIL_DOMAIN = of("email_domain")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            EMAIL_DOMAIN
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
            EMAIL_DOMAIN,
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
                EMAIL_DOMAIN -> Value.EMAIL_DOMAIN
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
                EMAIL_DOMAIN -> Known.EMAIL_DOMAIN
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

    /** Sender reputation for this domain (present on all domain responses). */
    class Reputation
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val band: JsonField<String>,
        private val breakdown: JsonField<Breakdown>,
        private val computedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("band") @ExcludeMissing band: JsonField<String> = JsonMissing.of(),
            @JsonProperty("breakdown")
            @ExcludeMissing
            breakdown: JsonField<Breakdown> = JsonMissing.of(),
            @JsonProperty("computed_at")
            @ExcludeMissing
            computedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(band, breakdown, computedAt, mutableMapOf())

        /**
         * Reputation band, e.g. good/warn/poor.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun band(): Optional<String> = band.getOptional("band")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun breakdown(): Optional<Breakdown> = breakdown.getOptional("breakdown")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun computedAt(): Optional<OffsetDateTime> = computedAt.getOptional("computed_at")

        /**
         * Returns the raw JSON value of [band].
         *
         * Unlike [band], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("band") @ExcludeMissing fun _band(): JsonField<String> = band

        /**
         * Returns the raw JSON value of [breakdown].
         *
         * Unlike [breakdown], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("breakdown")
        @ExcludeMissing
        fun _breakdown(): JsonField<Breakdown> = breakdown

        /**
         * Returns the raw JSON value of [computedAt].
         *
         * Unlike [computedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("computed_at")
        @ExcludeMissing
        fun _computedAt(): JsonField<OffsetDateTime> = computedAt

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

            /** Returns a mutable builder for constructing an instance of [Reputation]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reputation]. */
        class Builder internal constructor() {

            private var band: JsonField<String> = JsonMissing.of()
            private var breakdown: JsonField<Breakdown> = JsonMissing.of()
            private var computedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reputation: Reputation) = apply {
                band = reputation.band
                breakdown = reputation.breakdown
                computedAt = reputation.computedAt
                additionalProperties = reputation.additionalProperties.toMutableMap()
            }

            /** Reputation band, e.g. good/warn/poor. */
            fun band(band: String) = band(JsonField.of(band))

            /**
             * Sets [Builder.band] to an arbitrary JSON value.
             *
             * You should usually call [Builder.band] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun band(band: JsonField<String>) = apply { this.band = band }

            fun breakdown(breakdown: Breakdown) = breakdown(JsonField.of(breakdown))

            /**
             * Sets [Builder.breakdown] to an arbitrary JSON value.
             *
             * You should usually call [Builder.breakdown] with a well-typed [Breakdown] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun breakdown(breakdown: JsonField<Breakdown>) = apply { this.breakdown = breakdown }

            fun computedAt(computedAt: OffsetDateTime?) =
                computedAt(JsonField.ofNullable(computedAt))

            /** Alias for calling [Builder.computedAt] with `computedAt.orElse(null)`. */
            fun computedAt(computedAt: Optional<OffsetDateTime>) =
                computedAt(computedAt.getOrNull())

            /**
             * Sets [Builder.computedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.computedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun computedAt(computedAt: JsonField<OffsetDateTime>) = apply {
                this.computedAt = computedAt
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
             * Returns an immutable instance of [Reputation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Reputation =
                Reputation(band, breakdown, computedAt, additionalProperties.toMutableMap())
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
        fun validate(): Reputation = apply {
            if (validated) {
                return@apply
            }

            band()
            breakdown().ifPresent { it.validate() }
            computedAt()
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
            (if (band.asKnown().isPresent) 1 else 0) +
                (breakdown.asKnown().getOrNull()?.validity() ?: 0) +
                (if (computedAt.asKnown().isPresent) 1 else 0)

        class Breakdown
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Breakdown]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Breakdown]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(breakdown: Breakdown) = apply {
                    additionalProperties = breakdown.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Breakdown].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Breakdown = Breakdown(additionalProperties.toImmutable())
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
            fun validate(): Breakdown = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Breakdown && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Breakdown{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reputation &&
                band == other.band &&
                breakdown == other.breakdown &&
                computedAt == other.computedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(band, breakdown, computedAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reputation{band=$band, breakdown=$breakdown, computedAt=$computedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailDomain &&
            id == other.id &&
            createdAt == other.createdAt &&
            dkim == other.dkim &&
            dmarcPolicy == other.dmarcPolicy &&
            dnsRecords == other.dnsRecords &&
            domain == other.domain &&
            inbound == other.inbound &&
            recordType == other.recordType &&
            status == other.status &&
            tracking == other.tracking &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            usableForInbound == other.usableForInbound &&
            usableForSending == other.usableForSending &&
            verification == other.verification &&
            reputation == other.reputation &&
            verifiedAt == other.verifiedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            dkim,
            dmarcPolicy,
            dnsRecords,
            domain,
            inbound,
            recordType,
            status,
            tracking,
            type,
            updatedAt,
            usableForInbound,
            usableForSending,
            verification,
            reputation,
            verifiedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailDomain{id=$id, createdAt=$createdAt, dkim=$dkim, dmarcPolicy=$dmarcPolicy, dnsRecords=$dnsRecords, domain=$domain, inbound=$inbound, recordType=$recordType, status=$status, tracking=$tracking, type=$type, updatedAt=$updatedAt, usableForInbound=$usableForInbound, usableForSending=$usableForSending, verification=$verification, reputation=$reputation, verifiedAt=$verifiedAt, additionalProperties=$additionalProperties}"
}
