// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.remediation

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

class RemediationSubmitResponse
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
     * Full detail of a remediation request, returned on submit and GET by id.
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
         * Returns a mutable builder for constructing an instance of [RemediationSubmitResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RemediationSubmitResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(remediationSubmitResponse: RemediationSubmitResponse) = apply {
            data = remediationSubmitResponse.data
            additionalProperties = remediationSubmitResponse.additionalProperties.toMutableMap()
        }

        /** Full detail of a remediation request, returned on submit and GET by id. */
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
         * Returns an immutable instance of [RemediationSubmitResponse].
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
        fun build(): RemediationSubmitResponse =
            RemediationSubmitResponse(
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
    fun validate(): RemediationSubmitResponse = apply {
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

    /** Full detail of a remediation request, returned on submit and GET by id. */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val callPurpose: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val phoneNumbersCount: JsonField<Long>,
        private val phoneNumbersIneligible: JsonField<Long>,
        private val phoneNumbersSubmitted: JsonField<Long>,
        private val status: JsonField<Status>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val contactEmail: JsonField<String>,
        private val results: JsonField<Results>,
        private val tier1CompletedAt: JsonField<OffsetDateTime>,
        private val tier2CompletedAt: JsonField<OffsetDateTime>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_purpose")
            @ExcludeMissing
            callPurpose: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("phone_numbers_count")
            @ExcludeMissing
            phoneNumbersCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("phone_numbers_ineligible")
            @ExcludeMissing
            phoneNumbersIneligible: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("phone_numbers_submitted")
            @ExcludeMissing
            phoneNumbersSubmitted: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("contact_email")
            @ExcludeMissing
            contactEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("results") @ExcludeMissing results: JsonField<Results> = JsonMissing.of(),
            @JsonProperty("tier1_completed_at")
            @ExcludeMissing
            tier1CompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tier2_completed_at")
            @ExcludeMissing
            tier2CompletedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            callPurpose,
            createdAt,
            phoneNumbersCount,
            phoneNumbersIneligible,
            phoneNumbersSubmitted,
            status,
            updatedAt,
            contactEmail,
            results,
            tier1CompletedAt,
            tier2CompletedAt,
            webhookUrl,
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
        fun callPurpose(): String = callPurpose.getRequired("call_purpose")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * Total phone numbers in this batch, including any later cancelled. May exceed the sum of
         * the per-category result buckets, which omit cancelled numbers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumbersCount(): Long = phoneNumbersCount.getRequired("phone_numbers_count")

        /**
         * Numbers rejected before submission (e.g. cooldown).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumbersIneligible(): Long =
            phoneNumbersIneligible.getRequired("phone_numbers_ineligible")

        /**
         * Numbers accepted for remediation, i.e. not rejected as ineligible. Counts numbers still
         * queued (pending) as well as processed ones.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumbersSubmitted(): Long =
            phoneNumbersSubmitted.getRequired("phone_numbers_submitted")

        /**
         * Customer-facing status of a remediation request.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contactEmail(): Optional<String> = contactEmail.getOptional("contact_email")

        /**
         * Per-category buckets. Populated once results are available. Null while the request is
         * still pending.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun results(): Optional<Results> = results.getOptional("results")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tier1CompletedAt(): Optional<OffsetDateTime> =
            tier1CompletedAt.getOptional("tier1_completed_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tier2CompletedAt(): Optional<OffsetDateTime> =
            tier2CompletedAt.getOptional("tier2_completed_at")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [callPurpose].
         *
         * Unlike [callPurpose], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("call_purpose")
        @ExcludeMissing
        fun _callPurpose(): JsonField<String> = callPurpose

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [phoneNumbersCount].
         *
         * Unlike [phoneNumbersCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers_count")
        @ExcludeMissing
        fun _phoneNumbersCount(): JsonField<Long> = phoneNumbersCount

        /**
         * Returns the raw JSON value of [phoneNumbersIneligible].
         *
         * Unlike [phoneNumbersIneligible], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("phone_numbers_ineligible")
        @ExcludeMissing
        fun _phoneNumbersIneligible(): JsonField<Long> = phoneNumbersIneligible

        /**
         * Returns the raw JSON value of [phoneNumbersSubmitted].
         *
         * Unlike [phoneNumbersSubmitted], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("phone_numbers_submitted")
        @ExcludeMissing
        fun _phoneNumbersSubmitted(): JsonField<Long> = phoneNumbersSubmitted

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns the raw JSON value of [results].
         *
         * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<Results> = results

        /**
         * Returns the raw JSON value of [tier1CompletedAt].
         *
         * Unlike [tier1CompletedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tier1_completed_at")
        @ExcludeMissing
        fun _tier1CompletedAt(): JsonField<OffsetDateTime> = tier1CompletedAt

        /**
         * Returns the raw JSON value of [tier2CompletedAt].
         *
         * Unlike [tier2CompletedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tier2_completed_at")
        @ExcludeMissing
        fun _tier2CompletedAt(): JsonField<OffsetDateTime> = tier2CompletedAt

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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
             * .id()
             * .callPurpose()
             * .createdAt()
             * .phoneNumbersCount()
             * .phoneNumbersIneligible()
             * .phoneNumbersSubmitted()
             * .status()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var callPurpose: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var phoneNumbersCount: JsonField<Long>? = null
            private var phoneNumbersIneligible: JsonField<Long>? = null
            private var phoneNumbersSubmitted: JsonField<Long>? = null
            private var status: JsonField<Status>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var contactEmail: JsonField<String> = JsonMissing.of()
            private var results: JsonField<Results> = JsonMissing.of()
            private var tier1CompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var tier2CompletedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                callPurpose = data.callPurpose
                createdAt = data.createdAt
                phoneNumbersCount = data.phoneNumbersCount
                phoneNumbersIneligible = data.phoneNumbersIneligible
                phoneNumbersSubmitted = data.phoneNumbersSubmitted
                status = data.status
                updatedAt = data.updatedAt
                contactEmail = data.contactEmail
                results = data.results
                tier1CompletedAt = data.tier1CompletedAt
                tier2CompletedAt = data.tier2CompletedAt
                webhookUrl = data.webhookUrl
                additionalProperties = data.additionalProperties.toMutableMap()
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

            fun callPurpose(callPurpose: String) = callPurpose(JsonField.of(callPurpose))

            /**
             * Sets [Builder.callPurpose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callPurpose] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callPurpose(callPurpose: JsonField<String>) = apply {
                this.callPurpose = callPurpose
            }

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
             * Total phone numbers in this batch, including any later cancelled. May exceed the sum
             * of the per-category result buckets, which omit cancelled numbers.
             */
            fun phoneNumbersCount(phoneNumbersCount: Long) =
                phoneNumbersCount(JsonField.of(phoneNumbersCount))

            /**
             * Sets [Builder.phoneNumbersCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbersCount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumbersCount(phoneNumbersCount: JsonField<Long>) = apply {
                this.phoneNumbersCount = phoneNumbersCount
            }

            /** Numbers rejected before submission (e.g. cooldown). */
            fun phoneNumbersIneligible(phoneNumbersIneligible: Long) =
                phoneNumbersIneligible(JsonField.of(phoneNumbersIneligible))

            /**
             * Sets [Builder.phoneNumbersIneligible] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbersIneligible] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumbersIneligible(phoneNumbersIneligible: JsonField<Long>) = apply {
                this.phoneNumbersIneligible = phoneNumbersIneligible
            }

            /**
             * Numbers accepted for remediation, i.e. not rejected as ineligible. Counts numbers
             * still queued (pending) as well as processed ones.
             */
            fun phoneNumbersSubmitted(phoneNumbersSubmitted: Long) =
                phoneNumbersSubmitted(JsonField.of(phoneNumbersSubmitted))

            /**
             * Sets [Builder.phoneNumbersSubmitted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbersSubmitted] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun phoneNumbersSubmitted(phoneNumbersSubmitted: JsonField<Long>) = apply {
                this.phoneNumbersSubmitted = phoneNumbersSubmitted
            }

            /** Customer-facing status of a remediation request. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun contactEmail(contactEmail: String?) =
                contactEmail(JsonField.ofNullable(contactEmail))

            /** Alias for calling [Builder.contactEmail] with `contactEmail.orElse(null)`. */
            fun contactEmail(contactEmail: Optional<String>) =
                contactEmail(contactEmail.getOrNull())

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

            /**
             * Per-category buckets. Populated once results are available. Null while the request is
             * still pending.
             */
            fun results(results: Results?) = results(JsonField.ofNullable(results))

            /** Alias for calling [Builder.results] with `results.orElse(null)`. */
            fun results(results: Optional<Results>) = results(results.getOrNull())

            /**
             * Sets [Builder.results] to an arbitrary JSON value.
             *
             * You should usually call [Builder.results] with a well-typed [Results] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun results(results: JsonField<Results>) = apply { this.results = results }

            fun tier1CompletedAt(tier1CompletedAt: OffsetDateTime?) =
                tier1CompletedAt(JsonField.ofNullable(tier1CompletedAt))

            /**
             * Alias for calling [Builder.tier1CompletedAt] with `tier1CompletedAt.orElse(null)`.
             */
            fun tier1CompletedAt(tier1CompletedAt: Optional<OffsetDateTime>) =
                tier1CompletedAt(tier1CompletedAt.getOrNull())

            /**
             * Sets [Builder.tier1CompletedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier1CompletedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tier1CompletedAt(tier1CompletedAt: JsonField<OffsetDateTime>) = apply {
                this.tier1CompletedAt = tier1CompletedAt
            }

            fun tier2CompletedAt(tier2CompletedAt: OffsetDateTime?) =
                tier2CompletedAt(JsonField.ofNullable(tier2CompletedAt))

            /**
             * Alias for calling [Builder.tier2CompletedAt] with `tier2CompletedAt.orElse(null)`.
             */
            fun tier2CompletedAt(tier2CompletedAt: Optional<OffsetDateTime>) =
                tier2CompletedAt(tier2CompletedAt.getOrNull())

            /**
             * Sets [Builder.tier2CompletedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier2CompletedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tier2CompletedAt(tier2CompletedAt: JsonField<OffsetDateTime>) = apply {
                this.tier2CompletedAt = tier2CompletedAt
            }

            fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

            /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
            fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             * .id()
             * .callPurpose()
             * .createdAt()
             * .phoneNumbersCount()
             * .phoneNumbersIneligible()
             * .phoneNumbersSubmitted()
             * .status()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("callPurpose", callPurpose),
                    checkRequired("createdAt", createdAt),
                    checkRequired("phoneNumbersCount", phoneNumbersCount),
                    checkRequired("phoneNumbersIneligible", phoneNumbersIneligible),
                    checkRequired("phoneNumbersSubmitted", phoneNumbersSubmitted),
                    checkRequired("status", status),
                    checkRequired("updatedAt", updatedAt),
                    contactEmail,
                    results,
                    tier1CompletedAt,
                    tier2CompletedAt,
                    webhookUrl,
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

            id()
            callPurpose()
            createdAt()
            phoneNumbersCount()
            phoneNumbersIneligible()
            phoneNumbersSubmitted()
            status().validate()
            updatedAt()
            contactEmail()
            results().ifPresent { it.validate() }
            tier1CompletedAt()
            tier2CompletedAt()
            webhookUrl()
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
                (if (callPurpose.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (phoneNumbersCount.asKnown().isPresent) 1 else 0) +
                (if (phoneNumbersIneligible.asKnown().isPresent) 1 else 0) +
                (if (phoneNumbersSubmitted.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (contactEmail.asKnown().isPresent) 1 else 0) +
                (results.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tier1CompletedAt.asKnown().isPresent) 1 else 0) +
                (if (tier2CompletedAt.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        /** Customer-facing status of a remediation request. */
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

                @JvmField val PENDING = of("pending")

                @JvmField val IN_PROGRESS = of("in_progress")

                @JvmField val COMPLETED = of("completed")

                @JvmField val FAILED = of("failed")

                @JvmField val CANCELLED = of("cancelled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                IN_PROGRESS,
                COMPLETED,
                FAILED,
                CANCELLED,
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
                PENDING,
                IN_PROGRESS,
                COMPLETED,
                FAILED,
                CANCELLED,
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
                    PENDING -> Value.PENDING
                    IN_PROGRESS -> Value.IN_PROGRESS
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
                    CANCELLED -> Value.CANCELLED
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
                    IN_PROGRESS -> Known.IN_PROGRESS
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    CANCELLED -> Known.CANCELLED
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

        /**
         * Per-category buckets. Populated once results are available. Null while the request is
         * still pending.
         */
        class Results
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val ineligible: JsonField<List<String>>,
            private val notFlagged: JsonField<List<String>>,
            private val refused: JsonField<List<String>>,
            private val remediated: JsonField<List<String>>,
            private val requiresReview: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ineligible")
                @ExcludeMissing
                ineligible: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("not_flagged")
                @ExcludeMissing
                notFlagged: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("refused")
                @ExcludeMissing
                refused: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("remediated")
                @ExcludeMissing
                remediated: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("requires_review")
                @ExcludeMissing
                requiresReview: JsonField<List<String>> = JsonMissing.of(),
            ) : this(ineligible, notFlagged, refused, remediated, requiresReview, mutableMapOf())

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun ineligible(): Optional<List<String>> = ineligible.getOptional("ineligible")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun notFlagged(): Optional<List<String>> = notFlagged.getOptional("not_flagged")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun refused(): Optional<List<String>> = refused.getOptional("refused")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun remediated(): Optional<List<String>> = remediated.getOptional("remediated")

            /**
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun requiresReview(): Optional<List<String>> =
                requiresReview.getOptional("requires_review")

            /**
             * Returns the raw JSON value of [ineligible].
             *
             * Unlike [ineligible], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ineligible")
            @ExcludeMissing
            fun _ineligible(): JsonField<List<String>> = ineligible

            /**
             * Returns the raw JSON value of [notFlagged].
             *
             * Unlike [notFlagged], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("not_flagged")
            @ExcludeMissing
            fun _notFlagged(): JsonField<List<String>> = notFlagged

            /**
             * Returns the raw JSON value of [refused].
             *
             * Unlike [refused], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("refused")
            @ExcludeMissing
            fun _refused(): JsonField<List<String>> = refused

            /**
             * Returns the raw JSON value of [remediated].
             *
             * Unlike [remediated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("remediated")
            @ExcludeMissing
            fun _remediated(): JsonField<List<String>> = remediated

            /**
             * Returns the raw JSON value of [requiresReview].
             *
             * Unlike [requiresReview], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("requires_review")
            @ExcludeMissing
            fun _requiresReview(): JsonField<List<String>> = requiresReview

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

                /** Returns a mutable builder for constructing an instance of [Results]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Results]. */
            class Builder internal constructor() {

                private var ineligible: JsonField<MutableList<String>>? = null
                private var notFlagged: JsonField<MutableList<String>>? = null
                private var refused: JsonField<MutableList<String>>? = null
                private var remediated: JsonField<MutableList<String>>? = null
                private var requiresReview: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(results: Results) = apply {
                    ineligible = results.ineligible.map { it.toMutableList() }
                    notFlagged = results.notFlagged.map { it.toMutableList() }
                    refused = results.refused.map { it.toMutableList() }
                    remediated = results.remediated.map { it.toMutableList() }
                    requiresReview = results.requiresReview.map { it.toMutableList() }
                    additionalProperties = results.additionalProperties.toMutableMap()
                }

                fun ineligible(ineligible: List<String>) = ineligible(JsonField.of(ineligible))

                /**
                 * Sets [Builder.ineligible] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ineligible] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ineligible(ineligible: JsonField<List<String>>) = apply {
                    this.ineligible = ineligible.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.ineligible].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIneligible(ineligible: String) = apply {
                    this.ineligible =
                        (this.ineligible ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ineligible", it).add(ineligible)
                        }
                }

                fun notFlagged(notFlagged: List<String>) = notFlagged(JsonField.of(notFlagged))

                /**
                 * Sets [Builder.notFlagged] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.notFlagged] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun notFlagged(notFlagged: JsonField<List<String>>) = apply {
                    this.notFlagged = notFlagged.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.notFlagged].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addNotFlagged(notFlagged: String) = apply {
                    this.notFlagged =
                        (this.notFlagged ?: JsonField.of(mutableListOf())).also {
                            checkKnown("notFlagged", it).add(notFlagged)
                        }
                }

                fun refused(refused: List<String>) = refused(JsonField.of(refused))

                /**
                 * Sets [Builder.refused] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.refused] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun refused(refused: JsonField<List<String>>) = apply {
                    this.refused = refused.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.refused].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRefused(refused: String) = apply {
                    this.refused =
                        (this.refused ?: JsonField.of(mutableListOf())).also {
                            checkKnown("refused", it).add(refused)
                        }
                }

                fun remediated(remediated: List<String>) = remediated(JsonField.of(remediated))

                /**
                 * Sets [Builder.remediated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remediated] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun remediated(remediated: JsonField<List<String>>) = apply {
                    this.remediated = remediated.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.remediated].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRemediated(remediated: String) = apply {
                    this.remediated =
                        (this.remediated ?: JsonField.of(mutableListOf())).also {
                            checkKnown("remediated", it).add(remediated)
                        }
                }

                fun requiresReview(requiresReview: List<String>) =
                    requiresReview(JsonField.of(requiresReview))

                /**
                 * Sets [Builder.requiresReview] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requiresReview] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun requiresReview(requiresReview: JsonField<List<String>>) = apply {
                    this.requiresReview = requiresReview.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.requiresReview].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRequiresReview(requiresReview: String) = apply {
                    this.requiresReview =
                        (this.requiresReview ?: JsonField.of(mutableListOf())).also {
                            checkKnown("requiresReview", it).add(requiresReview)
                        }
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
                 * Returns an immutable instance of [Results].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Results =
                    Results(
                        (ineligible ?: JsonMissing.of()).map { it.toImmutable() },
                        (notFlagged ?: JsonMissing.of()).map { it.toImmutable() },
                        (refused ?: JsonMissing.of()).map { it.toImmutable() },
                        (remediated ?: JsonMissing.of()).map { it.toImmutable() },
                        (requiresReview ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): Results = apply {
                if (validated) {
                    return@apply
                }

                ineligible()
                notFlagged()
                refused()
                remediated()
                requiresReview()
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
                (ineligible.asKnown().getOrNull()?.size ?: 0) +
                    (notFlagged.asKnown().getOrNull()?.size ?: 0) +
                    (refused.asKnown().getOrNull()?.size ?: 0) +
                    (remediated.asKnown().getOrNull()?.size ?: 0) +
                    (requiresReview.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Results &&
                    ineligible == other.ineligible &&
                    notFlagged == other.notFlagged &&
                    refused == other.refused &&
                    remediated == other.remediated &&
                    requiresReview == other.requiresReview &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    ineligible,
                    notFlagged,
                    refused,
                    remediated,
                    requiresReview,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Results{ineligible=$ineligible, notFlagged=$notFlagged, refused=$refused, remediated=$remediated, requiresReview=$requiresReview, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                callPurpose == other.callPurpose &&
                createdAt == other.createdAt &&
                phoneNumbersCount == other.phoneNumbersCount &&
                phoneNumbersIneligible == other.phoneNumbersIneligible &&
                phoneNumbersSubmitted == other.phoneNumbersSubmitted &&
                status == other.status &&
                updatedAt == other.updatedAt &&
                contactEmail == other.contactEmail &&
                results == other.results &&
                tier1CompletedAt == other.tier1CompletedAt &&
                tier2CompletedAt == other.tier2CompletedAt &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                callPurpose,
                createdAt,
                phoneNumbersCount,
                phoneNumbersIneligible,
                phoneNumbersSubmitted,
                status,
                updatedAt,
                contactEmail,
                results,
                tier1CompletedAt,
                tier2CompletedAt,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, callPurpose=$callPurpose, createdAt=$createdAt, phoneNumbersCount=$phoneNumbersCount, phoneNumbersIneligible=$phoneNumbersIneligible, phoneNumbersSubmitted=$phoneNumbersSubmitted, status=$status, updatedAt=$updatedAt, contactEmail=$contactEmail, results=$results, tier1CompletedAt=$tier1CompletedAt, tier2CompletedAt=$tier2CompletedAt, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RemediationSubmitResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RemediationSubmitResponse{data=$data, additionalProperties=$additionalProperties}"
}
