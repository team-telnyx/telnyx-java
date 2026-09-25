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

class EmailDomainRotateDkimResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * Result of rotating a domain's DKIM key. The new key is active and signing switches to it
     * immediately; the previous key is retired to a `retiring` state (retained, not revoked) so it
     * can be revoked after the DNS propagation grace period. Selectors are fixed, so the DKIM DNS
     * record's TXT value is replaced in place at the shared `<selector>._domainkey.<domain>` host —
     * `old_selector_retained` is false and the returned dns_records carry the new value the
     * customer must publish promptly.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

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
         * [EmailDomainRotateDkimResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailDomainRotateDkimResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailDomainRotateDkimResponse: EmailDomainRotateDkimResponse) = apply {
            data = emailDomainRotateDkimResponse.data
            additionalProperties = emailDomainRotateDkimResponse.additionalProperties.toMutableMap()
        }

        /**
         * Result of rotating a domain's DKIM key. The new key is active and signing switches to it
         * immediately; the previous key is retired to a `retiring` state (retained, not revoked) so
         * it can be revoked after the DNS propagation grace period. Selectors are fixed, so the
         * DKIM DNS record's TXT value is replaced in place at the shared
         * `<selector>._domainkey.<domain>` host — `old_selector_retained` is false and the returned
         * dns_records carry the new value the customer must publish promptly.
         */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

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
         * Returns an immutable instance of [EmailDomainRotateDkimResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailDomainRotateDkimResponse =
            EmailDomainRotateDkimResponse(
                checkRequired("data", data),
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
    fun validate(): EmailDomainRotateDkimResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
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
    @JvmSynthetic internal fun validity(): Int = (data.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Result of rotating a domain's DKIM key. The new key is active and signing switches to it
     * immediately; the previous key is retired to a `retiring` state (retained, not revoked) so it
     * can be revoked after the DNS propagation grace period. Selectors are fixed, so the DKIM DNS
     * record's TXT value is replaced in place at the shared `<selector>._domainkey.<domain>` host —
     * `old_selector_retained` is false and the returned dns_records carry the new value the
     * customer must publish promptly.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dkim: JsonField<Dkim>,
        private val dnsRecords: JsonField<List<DnsRecord>>,
        private val domain: JsonField<String>,
        private val domainId: JsonField<String>,
        private val oldSelectorRetained: JsonField<Boolean>,
        private val previousDkimKey: JsonField<PreviousDkimKey>,
        private val recordType: JsonField<RecordType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dkim") @ExcludeMissing dkim: JsonField<Dkim> = JsonMissing.of(),
            @JsonProperty("dns_records")
            @ExcludeMissing
            dnsRecords: JsonField<List<DnsRecord>> = JsonMissing.of(),
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("domain_id")
            @ExcludeMissing
            domainId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("old_selector_retained")
            @ExcludeMissing
            oldSelectorRetained: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("previous_dkim_key")
            @ExcludeMissing
            previousDkimKey: JsonField<PreviousDkimKey> = JsonMissing.of(),
            @JsonProperty("record_type")
            @ExcludeMissing
            recordType: JsonField<RecordType> = JsonMissing.of(),
        ) : this(
            dkim,
            dnsRecords,
            domain,
            domainId,
            oldSelectorRetained,
            previousDkimKey,
            recordType,
            mutableMapOf(),
        )

        /**
         * The new active DKIM key.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dkim(): Dkim = dkim.getRequired("dkim")

        /**
         * The DKIM DNS records the customer must publish, carrying the new key's TXT value with
         * verification reset to pending.
         *
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
        fun domainId(): String = domainId.getRequired("domain_id")

        /**
         * False for this service: one selector is fixed per domain, so rotation replaces the TXT
         * value at the existing _domainkey host. There is no dual-selector overlap; publish the
         * replacement TXT promptly because signing switches immediately.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun oldSelectorRetained(): Boolean =
            oldSelectorRetained.getRequired("old_selector_retained")

        /**
         * The retired previous key, or null when the domain had no active key before rotation.
         * Retained in a `retiring` state so it can be revoked after the DNS propagation grace
         * period.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previousDkimKey(): Optional<PreviousDkimKey> =
            previousDkimKey.getOptional("previous_dkim_key")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recordType(): RecordType = recordType.getRequired("record_type")

        /**
         * Returns the raw JSON value of [dkim].
         *
         * Unlike [dkim], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dkim") @ExcludeMissing fun _dkim(): JsonField<Dkim> = dkim

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
         * Returns the raw JSON value of [domainId].
         *
         * Unlike [domainId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain_id") @ExcludeMissing fun _domainId(): JsonField<String> = domainId

        /**
         * Returns the raw JSON value of [oldSelectorRetained].
         *
         * Unlike [oldSelectorRetained], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("old_selector_retained")
        @ExcludeMissing
        fun _oldSelectorRetained(): JsonField<Boolean> = oldSelectorRetained

        /**
         * Returns the raw JSON value of [previousDkimKey].
         *
         * Unlike [previousDkimKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("previous_dkim_key")
        @ExcludeMissing
        fun _previousDkimKey(): JsonField<PreviousDkimKey> = previousDkimKey

        /**
         * Returns the raw JSON value of [recordType].
         *
         * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("record_type")
        @ExcludeMissing
        fun _recordType(): JsonField<RecordType> = recordType

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .dkim()
             * .dnsRecords()
             * .domain()
             * .domainId()
             * .oldSelectorRetained()
             * .previousDkimKey()
             * .recordType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var dkim: JsonField<Dkim>? = null
            private var dnsRecords: JsonField<MutableList<DnsRecord>>? = null
            private var domain: JsonField<String>? = null
            private var domainId: JsonField<String>? = null
            private var oldSelectorRetained: JsonField<Boolean>? = null
            private var previousDkimKey: JsonField<PreviousDkimKey>? = null
            private var recordType: JsonField<RecordType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                dkim = data.dkim
                dnsRecords = data.dnsRecords.map { it.toMutableList() }
                domain = data.domain
                domainId = data.domainId
                oldSelectorRetained = data.oldSelectorRetained
                previousDkimKey = data.previousDkimKey
                recordType = data.recordType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The new active DKIM key. */
            fun dkim(dkim: Dkim) = dkim(JsonField.of(dkim))

            /**
             * Sets [Builder.dkim] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dkim] with a well-typed [Dkim] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun dkim(dkim: JsonField<Dkim>) = apply { this.dkim = dkim }

            /**
             * The DKIM DNS records the customer must publish, carrying the new key's TXT value with
             * verification reset to pending.
             */
            fun dnsRecords(dnsRecords: List<DnsRecord>) = dnsRecords(JsonField.of(dnsRecords))

            /**
             * Sets [Builder.dnsRecords] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dnsRecords] with a well-typed `List<DnsRecord>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            fun domainId(domainId: String) = domainId(JsonField.of(domainId))

            /**
             * Sets [Builder.domainId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domainId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domainId(domainId: JsonField<String>) = apply { this.domainId = domainId }

            /**
             * False for this service: one selector is fixed per domain, so rotation replaces the
             * TXT value at the existing _domainkey host. There is no dual-selector overlap; publish
             * the replacement TXT promptly because signing switches immediately.
             */
            fun oldSelectorRetained(oldSelectorRetained: Boolean) =
                oldSelectorRetained(JsonField.of(oldSelectorRetained))

            /**
             * Sets [Builder.oldSelectorRetained] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oldSelectorRetained] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun oldSelectorRetained(oldSelectorRetained: JsonField<Boolean>) = apply {
                this.oldSelectorRetained = oldSelectorRetained
            }

            /**
             * The retired previous key, or null when the domain had no active key before rotation.
             * Retained in a `retiring` state so it can be revoked after the DNS propagation grace
             * period.
             */
            fun previousDkimKey(previousDkimKey: PreviousDkimKey?) =
                previousDkimKey(JsonField.ofNullable(previousDkimKey))

            /** Alias for calling [Builder.previousDkimKey] with `previousDkimKey.orElse(null)`. */
            fun previousDkimKey(previousDkimKey: Optional<PreviousDkimKey>) =
                previousDkimKey(previousDkimKey.getOrNull())

            /**
             * Sets [Builder.previousDkimKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousDkimKey] with a well-typed [PreviousDkimKey]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun previousDkimKey(previousDkimKey: JsonField<PreviousDkimKey>) = apply {
                this.previousDkimKey = previousDkimKey
            }

            fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

            /**
             * Sets [Builder.recordType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordType] with a well-typed [RecordType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recordType(recordType: JsonField<RecordType>) = apply {
                this.recordType = recordType
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .dkim()
             * .dnsRecords()
             * .domain()
             * .domainId()
             * .oldSelectorRetained()
             * .previousDkimKey()
             * .recordType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("dkim", dkim),
                    checkRequired("dnsRecords", dnsRecords).map { it.toImmutable() },
                    checkRequired("domain", domain),
                    checkRequired("domainId", domainId),
                    checkRequired("oldSelectorRetained", oldSelectorRetained),
                    checkRequired("previousDkimKey", previousDkimKey),
                    checkRequired("recordType", recordType),
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            dkim().validate()
            dnsRecords().forEach { it.validate() }
            domain()
            domainId()
            oldSelectorRetained()
            previousDkimKey().ifPresent { it.validate() }
            recordType().validate()
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
            (dkim.asKnown().getOrNull()?.validity() ?: 0) +
                (dnsRecords.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (domain.asKnown().isPresent) 1 else 0) +
                (if (domainId.asKnown().isPresent) 1 else 0) +
                (if (oldSelectorRetained.asKnown().isPresent) 1 else 0) +
                (previousDkimKey.asKnown().getOrNull()?.validity() ?: 0) +
                (recordType.asKnown().getOrNull()?.validity() ?: 0)

        /** The new active DKIM key. */
        class Dkim
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val algorithm: JsonField<Algorithm>,
            private val keyLength: JsonField<KeyLength>,
            private val selector: JsonField<String>,
            private val status: JsonField<Status>,
            private val version: JsonField<Long>,
            private val activatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("algorithm")
                @ExcludeMissing
                algorithm: JsonField<Algorithm> = JsonMissing.of(),
                @JsonProperty("key_length")
                @ExcludeMissing
                keyLength: JsonField<KeyLength> = JsonMissing.of(),
                @JsonProperty("selector")
                @ExcludeMissing
                selector: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("version")
                @ExcludeMissing
                version: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("activated_at")
                @ExcludeMissing
                activatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                id,
                algorithm,
                keyLength,
                selector,
                status,
                version,
                activatedAt,
                mutableMapOf(),
            )

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun algorithm(): Algorithm = algorithm.getRequired("algorithm")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun keyLength(): KeyLength = keyLength.getRequired("key_length")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun selector(): String = selector.getRequired("selector")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * Monotonically increasing per-domain key version.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun version(): Long = version.getRequired("version")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun activatedAt(): Optional<OffsetDateTime> = activatedAt.getOptional("activated_at")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [algorithm].
             *
             * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("algorithm")
            @ExcludeMissing
            fun _algorithm(): JsonField<Algorithm> = algorithm

            /**
             * Returns the raw JSON value of [keyLength].
             *
             * Unlike [keyLength], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("key_length")
            @ExcludeMissing
            fun _keyLength(): JsonField<KeyLength> = keyLength

            /**
             * Returns the raw JSON value of [selector].
             *
             * Unlike [selector], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("selector") @ExcludeMissing fun _selector(): JsonField<String> = selector

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

            /**
             * Returns the raw JSON value of [activatedAt].
             *
             * Unlike [activatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("activated_at")
            @ExcludeMissing
            fun _activatedAt(): JsonField<OffsetDateTime> = activatedAt

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
                 * .id()
                 * .algorithm()
                 * .keyLength()
                 * .selector()
                 * .status()
                 * .version()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dkim]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var algorithm: JsonField<Algorithm>? = null
                private var keyLength: JsonField<KeyLength>? = null
                private var selector: JsonField<String>? = null
                private var status: JsonField<Status>? = null
                private var version: JsonField<Long>? = null
                private var activatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dkim: Dkim) = apply {
                    id = dkim.id
                    algorithm = dkim.algorithm
                    keyLength = dkim.keyLength
                    selector = dkim.selector
                    status = dkim.status
                    version = dkim.version
                    activatedAt = dkim.activatedAt
                    additionalProperties = dkim.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun algorithm(algorithm: Algorithm) = algorithm(JsonField.of(algorithm))

                /**
                 * Sets [Builder.algorithm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.algorithm] with a well-typed [Algorithm] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun algorithm(algorithm: JsonField<Algorithm>) = apply {
                    this.algorithm = algorithm
                }

                fun keyLength(keyLength: KeyLength) = keyLength(JsonField.of(keyLength))

                /**
                 * Sets [Builder.keyLength] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keyLength] with a well-typed [KeyLength] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun keyLength(keyLength: JsonField<KeyLength>) = apply {
                    this.keyLength = keyLength
                }

                fun selector(selector: String) = selector(JsonField.of(selector))

                /**
                 * Sets [Builder.selector] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.selector] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun selector(selector: JsonField<String>) = apply { this.selector = selector }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /** Monotonically increasing per-domain key version. */
                fun version(version: Long) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun version(version: JsonField<Long>) = apply { this.version = version }

                fun activatedAt(activatedAt: OffsetDateTime?) =
                    activatedAt(JsonField.ofNullable(activatedAt))

                /** Alias for calling [Builder.activatedAt] with `activatedAt.orElse(null)`. */
                fun activatedAt(activatedAt: Optional<OffsetDateTime>) =
                    activatedAt(activatedAt.getOrNull())

                /**
                 * Sets [Builder.activatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.activatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun activatedAt(activatedAt: JsonField<OffsetDateTime>) = apply {
                    this.activatedAt = activatedAt
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
                 * Returns an immutable instance of [Dkim].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .algorithm()
                 * .keyLength()
                 * .selector()
                 * .status()
                 * .version()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Dkim =
                    Dkim(
                        checkRequired("id", id),
                        checkRequired("algorithm", algorithm),
                        checkRequired("keyLength", keyLength),
                        checkRequired("selector", selector),
                        checkRequired("status", status),
                        checkRequired("version", version),
                        activatedAt,
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
            fun validate(): Dkim = apply {
                if (validated) {
                    return@apply
                }

                id()
                algorithm().validate()
                keyLength().validate()
                selector()
                status().validate()
                version()
                activatedAt()
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
                    (algorithm.asKnown().getOrNull()?.validity() ?: 0) +
                    (keyLength.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (selector.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (version.asKnown().isPresent) 1 else 0) +
                    (if (activatedAt.asKnown().isPresent) 1 else 0)

            class Algorithm @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        _2048 -> Known._2048
                        else -> throw TelnyxInvalidDataException("Unknown KeyLength: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACTIVE = of("active")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    ACTIVE
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACTIVE,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACTIVE -> Value.ACTIVE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACTIVE -> Known.ACTIVE
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

                return other is Dkim &&
                    id == other.id &&
                    algorithm == other.algorithm &&
                    keyLength == other.keyLength &&
                    selector == other.selector &&
                    status == other.status &&
                    version == other.version &&
                    activatedAt == other.activatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    algorithm,
                    keyLength,
                    selector,
                    status,
                    version,
                    activatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Dkim{id=$id, algorithm=$algorithm, keyLength=$keyLength, selector=$selector, status=$status, version=$version, activatedAt=$activatedAt, additionalProperties=$additionalProperties}"
        }

        /**
         * The retired previous key, or null when the domain had no active key before rotation.
         * Retained in a `retiring` state so it can be revoked after the DNS propagation grace
         * period.
         */
        class PreviousDkimKey
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val selector: JsonField<String>,
            private val status: JsonField<Status>,
            private val version: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("selector")
                @ExcludeMissing
                selector: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            ) : this(id, selector, status, version, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun selector(): String = selector.getRequired("selector")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun version(): Long = version.getRequired("version")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [selector].
             *
             * Unlike [selector], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("selector") @ExcludeMissing fun _selector(): JsonField<String> = selector

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [version].
             *
             * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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
                 * Returns a mutable builder for constructing an instance of [PreviousDkimKey].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .selector()
                 * .status()
                 * .version()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PreviousDkimKey]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var selector: JsonField<String>? = null
                private var status: JsonField<Status>? = null
                private var version: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(previousDkimKey: PreviousDkimKey) = apply {
                    id = previousDkimKey.id
                    selector = previousDkimKey.selector
                    status = previousDkimKey.status
                    version = previousDkimKey.version
                    additionalProperties = previousDkimKey.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun selector(selector: String) = selector(JsonField.of(selector))

                /**
                 * Sets [Builder.selector] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.selector] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun selector(selector: JsonField<String>) = apply { this.selector = selector }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun version(version: Long) = version(JsonField.of(version))

                /**
                 * Sets [Builder.version] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.version] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun version(version: JsonField<Long>) = apply { this.version = version }

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
                 * Returns an immutable instance of [PreviousDkimKey].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .selector()
                 * .status()
                 * .version()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PreviousDkimKey =
                    PreviousDkimKey(
                        checkRequired("id", id),
                        checkRequired("selector", selector),
                        checkRequired("status", status),
                        checkRequired("version", version),
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
            fun validate(): PreviousDkimKey = apply {
                if (validated) {
                    return@apply
                }

                id()
                selector()
                status().validate()
                version()
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
                    (if (selector.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (version.asKnown().isPresent) 1 else 0)

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val RETIRING = of("retiring")

                    @JvmField val REVOKED = of("revoked")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    RETIRING,
                    REVOKED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    RETIRING,
                    REVOKED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        RETIRING -> Value.RETIRING
                        REVOKED -> Value.REVOKED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        RETIRING -> Known.RETIRING
                        REVOKED -> Known.REVOKED
                        else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws TelnyxInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
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

                return other is PreviousDkimKey &&
                    id == other.id &&
                    selector == other.selector &&
                    status == other.status &&
                    version == other.version &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, selector, status, version, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PreviousDkimKey{id=$id, selector=$selector, status=$status, version=$version, additionalProperties=$additionalProperties}"
        }

        class RecordType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val EMAIL_DOMAIN_DKIM_ROTATION = of("email_domain_dkim_rotation")

                @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
            }

            /** An enum containing [RecordType]'s known values. */
            enum class Known {
                EMAIL_DOMAIN_DKIM_ROTATION
            }

            /**
             * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RecordType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMAIL_DOMAIN_DKIM_ROTATION,
                /**
                 * An enum member indicating that [RecordType] was instantiated with an unknown
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
                    EMAIL_DOMAIN_DKIM_ROTATION -> Value.EMAIL_DOMAIN_DKIM_ROTATION
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
                    EMAIL_DOMAIN_DKIM_ROTATION -> Known.EMAIL_DOMAIN_DKIM_ROTATION
                    else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
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

            return other is Data &&
                dkim == other.dkim &&
                dnsRecords == other.dnsRecords &&
                domain == other.domain &&
                domainId == other.domainId &&
                oldSelectorRetained == other.oldSelectorRetained &&
                previousDkimKey == other.previousDkimKey &&
                recordType == other.recordType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dkim,
                dnsRecords,
                domain,
                domainId,
                oldSelectorRetained,
                previousDkimKey,
                recordType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{dkim=$dkim, dnsRecords=$dnsRecords, domain=$domain, domainId=$domainId, oldSelectorRetained=$oldSelectorRetained, previousDkimKey=$previousDkimKey, recordType=$recordType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailDomainRotateDkimResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailDomainRotateDkimResponse{data=$data, additionalProperties=$additionalProperties}"
}
