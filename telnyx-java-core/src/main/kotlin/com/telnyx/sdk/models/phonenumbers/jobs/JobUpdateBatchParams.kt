// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.jobs

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
import com.telnyx.sdk.models.phonenumbers.voice.UpdateVoiceSettings
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new background job to update a batch of numbers. At most one thousand numbers can be
 * updated per API call. At least one of the updateable fields must be submitted. IMPORTANT: You
 * must either specify filters (using the filter parameters) or specific phone numbers (using the
 * phone_numbers parameter in the request body). If you specify filters, ALL phone numbers that
 * match the given filters (up to 1000 at a time) will be updated. If you want to update only
 * specific numbers, you must use the phone_numbers parameter in the request body. When using the
 * phone_numbers parameter, ensure you follow the correct format as shown in the example (either
 * phone number IDs or phone numbers in E164 format).
 */
class JobUpdateBatchParams
private constructor(
    private val filter: Filter?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[has_bundle],
     * filter[tag], filter[connection_id], filter[phone_number], filter[status],
     * filter[voice.connection_name], filter[voice.usage_payment_method], filter[billing_group_id],
     * filter[emergency_address_id], filter[customer_reference]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /**
     * Array of phone number ids and/or phone numbers in E164 format to update. This parameter is
     * required if no filter parameters are provided. If you want to update specific numbers rather
     * than all numbers matching a filter, you must use this parameter. Each item must be either a
     * valid phone number ID or a phone number in E164 format (e.g., '+13127367254').
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumbers(): List<String> = body.phoneNumbers()

    /**
     * Identifies the billing group associated with the phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = body.billingGroupId()

    /**
     * Identifies the connection associated with the phone number.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionId(): Optional<String> = body.connectionId()

    /**
     * A customer reference string for customer look ups.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerReference(): Optional<String> = body.customerReference()

    /**
     * Indicates whether to enable or disable the deletion lock on each phone number. When enabled,
     * this prevents the phone number from being deleted via the API or Telnyx portal.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deletionLockEnabled(): Optional<Boolean> = body.deletionLockEnabled()

    /**
     * If someone attempts to port your phone number away from Telnyx and your phone number has an
     * external PIN set, we will attempt to verify that you provided the correct external PIN to the
     * winning carrier. Note that not all carriers cooperate with this security mechanism.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalPin(): Optional<String> = body.externalPin()

    /**
     * Indicates whether to enable or disable HD Voice on each phone number. HD Voice is a paid
     * feature and may not be available for all phone numbers, more details about it can be found in
     * the Telnyx support documentation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hdVoiceEnabled(): Optional<Boolean> = body.hdVoiceEnabled()

    /**
     * A list of user-assigned tags to help organize phone numbers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voice(): Optional<UpdateVoiceSettings> = body.voice()

    /**
     * Returns the raw JSON value of [phoneNumbers].
     *
     * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _phoneNumbers(): JsonField<List<String>> = body._phoneNumbers()

    /**
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingGroupId(): JsonField<String> = body._billingGroupId()

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
     * Returns the raw JSON value of [deletionLockEnabled].
     *
     * Unlike [deletionLockEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _deletionLockEnabled(): JsonField<Boolean> = body._deletionLockEnabled()

    /**
     * Returns the raw JSON value of [externalPin].
     *
     * Unlike [externalPin], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalPin(): JsonField<String> = body._externalPin()

    /**
     * Returns the raw JSON value of [hdVoiceEnabled].
     *
     * Unlike [hdVoiceEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _hdVoiceEnabled(): JsonField<Boolean> = body._hdVoiceEnabled()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [voice].
     *
     * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voice(): JsonField<UpdateVoiceSettings> = body._voice()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobUpdateBatchParams].
         *
         * The following fields are required:
         * ```java
         * .phoneNumbers()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [JobUpdateBatchParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(jobUpdateBatchParams: JobUpdateBatchParams) = apply {
            filter = jobUpdateBatchParams.filter
            body = jobUpdateBatchParams.body.toBuilder()
            additionalHeaders = jobUpdateBatchParams.additionalHeaders.toBuilder()
            additionalQueryParams = jobUpdateBatchParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[has_bundle],
         * filter[tag], filter[connection_id], filter[phone_number], filter[status],
         * filter[voice.connection_name], filter[voice.usage_payment_method],
         * filter[billing_group_id], filter[emergency_address_id], filter[customer_reference]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [phoneNumbers]
         * - [billingGroupId]
         * - [connectionId]
         * - [customerReference]
         * - [deletionLockEnabled]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Array of phone number ids and/or phone numbers in E164 format to update. This parameter
         * is required if no filter parameters are provided. If you want to update specific numbers
         * rather than all numbers matching a filter, you must use this parameter. Each item must be
         * either a valid phone number ID or a phone number in E164 format (e.g., '+13127367254').
         */
        fun phoneNumbers(phoneNumbers: List<String>) = apply { body.phoneNumbers(phoneNumbers) }

        /**
         * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
            body.phoneNumbers(phoneNumbers)
        }

        /**
         * Adds a single [String] to [phoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhoneNumber(phoneNumber: String) = apply { body.addPhoneNumber(phoneNumber) }

        /** Identifies the billing group associated with the phone number. */
        fun billingGroupId(billingGroupId: String) = apply { body.billingGroupId(billingGroupId) }

        /**
         * Sets [Builder.billingGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingGroupId(billingGroupId: JsonField<String>) = apply {
            body.billingGroupId(billingGroupId)
        }

        /** Identifies the connection associated with the phone number. */
        fun connectionId(connectionId: String) = apply { body.connectionId(connectionId) }

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

        /** A customer reference string for customer look ups. */
        fun customerReference(customerReference: String) = apply {
            body.customerReference(customerReference)
        }

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

        /**
         * Indicates whether to enable or disable the deletion lock on each phone number. When
         * enabled, this prevents the phone number from being deleted via the API or Telnyx portal.
         */
        fun deletionLockEnabled(deletionLockEnabled: Boolean) = apply {
            body.deletionLockEnabled(deletionLockEnabled)
        }

        /**
         * Sets [Builder.deletionLockEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deletionLockEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deletionLockEnabled(deletionLockEnabled: JsonField<Boolean>) = apply {
            body.deletionLockEnabled(deletionLockEnabled)
        }

        /**
         * If someone attempts to port your phone number away from Telnyx and your phone number has
         * an external PIN set, we will attempt to verify that you provided the correct external PIN
         * to the winning carrier. Note that not all carriers cooperate with this security
         * mechanism.
         */
        fun externalPin(externalPin: String) = apply { body.externalPin(externalPin) }

        /**
         * Sets [Builder.externalPin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalPin] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalPin(externalPin: JsonField<String>) = apply { body.externalPin(externalPin) }

        /**
         * Indicates whether to enable or disable HD Voice on each phone number. HD Voice is a paid
         * feature and may not be available for all phone numbers, more details about it can be
         * found in the Telnyx support documentation.
         */
        fun hdVoiceEnabled(hdVoiceEnabled: Boolean) = apply { body.hdVoiceEnabled(hdVoiceEnabled) }

        /**
         * Sets [Builder.hdVoiceEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hdVoiceEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hdVoiceEnabled(hdVoiceEnabled: JsonField<Boolean>) = apply {
            body.hdVoiceEnabled(hdVoiceEnabled)
        }

        /** A list of user-assigned tags to help organize phone numbers. */
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

        fun voice(voice: UpdateVoiceSettings) = apply { body.voice(voice) }

        /**
         * Sets [Builder.voice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voice] with a well-typed [UpdateVoiceSettings] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voice(voice: JsonField<UpdateVoiceSettings>) = apply { body.voice(voice) }

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
         * Returns an immutable instance of [JobUpdateBatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .phoneNumbers()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): JobUpdateBatchParams =
            JobUpdateBatchParams(
                filter,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.billingGroupId().ifPresent { put("filter[billing_group_id]", it) }
                    it.connectionId().ifPresent { put("filter[connection_id]", it) }
                    it.customerReference().ifPresent { put("filter[customer_reference]", it) }
                    it.emergencyAddressId().ifPresent { put("filter[emergency_address_id]", it) }
                    it.hasBundle().ifPresent { put("filter[has_bundle]", it) }
                    it.phoneNumber().ifPresent { put("filter[phone_number]", it) }
                    it.status().ifPresent { put("filter[status]", it.toString()) }
                    it.tag().ifPresent { put("filter[tag]", it) }
                    it.voiceConnectionName().ifPresent {
                        it.contains().ifPresent {
                            put("filter[voice.connection_name][contains]", it)
                        }
                        it.endsWith().ifPresent {
                            put("filter[voice.connection_name][ends_with]", it)
                        }
                        it.eq().ifPresent { put("filter[voice.connection_name][eq]", it) }
                        it.startsWith().ifPresent {
                            put("filter[voice.connection_name][starts_with]", it)
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[voice.connection_name][$key]", value)
                            }
                        }
                    }
                    it.voiceUsagePaymentMethod().ifPresent {
                        put("filter[voice.usage_payment_method]", it.toString())
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val phoneNumbers: JsonField<List<String>>,
        private val billingGroupId: JsonField<String>,
        private val connectionId: JsonField<String>,
        private val customerReference: JsonField<String>,
        private val deletionLockEnabled: JsonField<Boolean>,
        private val externalPin: JsonField<String>,
        private val hdVoiceEnabled: JsonField<Boolean>,
        private val tags: JsonField<List<String>>,
        private val voice: JsonField<UpdateVoiceSettings>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("phone_numbers")
            @ExcludeMissing
            phoneNumbers: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("connection_id")
            @ExcludeMissing
            connectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_reference")
            @ExcludeMissing
            customerReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deletion_lock_enabled")
            @ExcludeMissing
            deletionLockEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("external_pin")
            @ExcludeMissing
            externalPin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hd_voice_enabled")
            @ExcludeMissing
            hdVoiceEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("voice")
            @ExcludeMissing
            voice: JsonField<UpdateVoiceSettings> = JsonMissing.of(),
        ) : this(
            phoneNumbers,
            billingGroupId,
            connectionId,
            customerReference,
            deletionLockEnabled,
            externalPin,
            hdVoiceEnabled,
            tags,
            voice,
            mutableMapOf(),
        )

        /**
         * Array of phone number ids and/or phone numbers in E164 format to update. This parameter
         * is required if no filter parameters are provided. If you want to update specific numbers
         * rather than all numbers matching a filter, you must use this parameter. Each item must be
         * either a valid phone number ID or a phone number in E164 format (e.g., '+13127367254').
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumbers(): List<String> = phoneNumbers.getRequired("phone_numbers")

        /**
         * Identifies the billing group associated with the phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

        /**
         * Identifies the connection associated with the phone number.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun connectionId(): Optional<String> = connectionId.getOptional("connection_id")

        /**
         * A customer reference string for customer look ups.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerReference(): Optional<String> =
            customerReference.getOptional("customer_reference")

        /**
         * Indicates whether to enable or disable the deletion lock on each phone number. When
         * enabled, this prevents the phone number from being deleted via the API or Telnyx portal.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deletionLockEnabled(): Optional<Boolean> =
            deletionLockEnabled.getOptional("deletion_lock_enabled")

        /**
         * If someone attempts to port your phone number away from Telnyx and your phone number has
         * an external PIN set, we will attempt to verify that you provided the correct external PIN
         * to the winning carrier. Note that not all carriers cooperate with this security
         * mechanism.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPin(): Optional<String> = externalPin.getOptional("external_pin")

        /**
         * Indicates whether to enable or disable HD Voice on each phone number. HD Voice is a paid
         * feature and may not be available for all phone numbers, more details about it can be
         * found in the Telnyx support documentation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hdVoiceEnabled(): Optional<Boolean> = hdVoiceEnabled.getOptional("hd_voice_enabled")

        /**
         * A list of user-assigned tags to help organize phone numbers.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voice(): Optional<UpdateVoiceSettings> = voice.getOptional("voice")

        /**
         * Returns the raw JSON value of [phoneNumbers].
         *
         * Unlike [phoneNumbers], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("phone_numbers")
        @ExcludeMissing
        fun _phoneNumbers(): JsonField<List<String>> = phoneNumbers

        /**
         * Returns the raw JSON value of [billingGroupId].
         *
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

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
         * Returns the raw JSON value of [deletionLockEnabled].
         *
         * Unlike [deletionLockEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("deletion_lock_enabled")
        @ExcludeMissing
        fun _deletionLockEnabled(): JsonField<Boolean> = deletionLockEnabled

        /**
         * Returns the raw JSON value of [externalPin].
         *
         * Unlike [externalPin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_pin")
        @ExcludeMissing
        fun _externalPin(): JsonField<String> = externalPin

        /**
         * Returns the raw JSON value of [hdVoiceEnabled].
         *
         * Unlike [hdVoiceEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hd_voice_enabled")
        @ExcludeMissing
        fun _hdVoiceEnabled(): JsonField<Boolean> = hdVoiceEnabled

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [voice].
         *
         * Unlike [voice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voice") @ExcludeMissing fun _voice(): JsonField<UpdateVoiceSettings> = voice

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
             * .phoneNumbers()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var phoneNumbers: JsonField<MutableList<String>>? = null
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var connectionId: JsonField<String> = JsonMissing.of()
            private var customerReference: JsonField<String> = JsonMissing.of()
            private var deletionLockEnabled: JsonField<Boolean> = JsonMissing.of()
            private var externalPin: JsonField<String> = JsonMissing.of()
            private var hdVoiceEnabled: JsonField<Boolean> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var voice: JsonField<UpdateVoiceSettings> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                phoneNumbers = body.phoneNumbers.map { it.toMutableList() }
                billingGroupId = body.billingGroupId
                connectionId = body.connectionId
                customerReference = body.customerReference
                deletionLockEnabled = body.deletionLockEnabled
                externalPin = body.externalPin
                hdVoiceEnabled = body.hdVoiceEnabled
                tags = body.tags.map { it.toMutableList() }
                voice = body.voice
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Array of phone number ids and/or phone numbers in E164 format to update. This
             * parameter is required if no filter parameters are provided. If you want to update
             * specific numbers rather than all numbers matching a filter, you must use this
             * parameter. Each item must be either a valid phone number ID or a phone number in E164
             * format (e.g., '+13127367254').
             */
            fun phoneNumbers(phoneNumbers: List<String>) = phoneNumbers(JsonField.of(phoneNumbers))

            /**
             * Sets [Builder.phoneNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumbers] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumbers(phoneNumbers: JsonField<List<String>>) = apply {
                this.phoneNumbers = phoneNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [phoneNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPhoneNumber(phoneNumber: String) = apply {
                phoneNumbers =
                    (phoneNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("phoneNumbers", it).add(phoneNumber)
                    }
            }

            /** Identifies the billing group associated with the phone number. */
            fun billingGroupId(billingGroupId: String) =
                billingGroupId(JsonField.of(billingGroupId))

            /**
             * Sets [Builder.billingGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingGroupId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingGroupId(billingGroupId: JsonField<String>) = apply {
                this.billingGroupId = billingGroupId
            }

            /** Identifies the connection associated with the phone number. */
            fun connectionId(connectionId: String) = connectionId(JsonField.of(connectionId))

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

            /** A customer reference string for customer look ups. */
            fun customerReference(customerReference: String) =
                customerReference(JsonField.of(customerReference))

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

            /**
             * Indicates whether to enable or disable the deletion lock on each phone number. When
             * enabled, this prevents the phone number from being deleted via the API or Telnyx
             * portal.
             */
            fun deletionLockEnabled(deletionLockEnabled: Boolean) =
                deletionLockEnabled(JsonField.of(deletionLockEnabled))

            /**
             * Sets [Builder.deletionLockEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deletionLockEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deletionLockEnabled(deletionLockEnabled: JsonField<Boolean>) = apply {
                this.deletionLockEnabled = deletionLockEnabled
            }

            /**
             * If someone attempts to port your phone number away from Telnyx and your phone number
             * has an external PIN set, we will attempt to verify that you provided the correct
             * external PIN to the winning carrier. Note that not all carriers cooperate with this
             * security mechanism.
             */
            fun externalPin(externalPin: String) = externalPin(JsonField.of(externalPin))

            /**
             * Sets [Builder.externalPin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPin] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPin(externalPin: JsonField<String>) = apply {
                this.externalPin = externalPin
            }

            /**
             * Indicates whether to enable or disable HD Voice on each phone number. HD Voice is a
             * paid feature and may not be available for all phone numbers, more details about it
             * can be found in the Telnyx support documentation.
             */
            fun hdVoiceEnabled(hdVoiceEnabled: Boolean) =
                hdVoiceEnabled(JsonField.of(hdVoiceEnabled))

            /**
             * Sets [Builder.hdVoiceEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hdVoiceEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hdVoiceEnabled(hdVoiceEnabled: JsonField<Boolean>) = apply {
                this.hdVoiceEnabled = hdVoiceEnabled
            }

            /** A list of user-assigned tags to help organize phone numbers. */
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

            fun voice(voice: UpdateVoiceSettings) = voice(JsonField.of(voice))

            /**
             * Sets [Builder.voice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voice] with a well-typed [UpdateVoiceSettings] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voice(voice: JsonField<UpdateVoiceSettings>) = apply { this.voice = voice }

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
             * .phoneNumbers()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("phoneNumbers", phoneNumbers).map { it.toImmutable() },
                    billingGroupId,
                    connectionId,
                    customerReference,
                    deletionLockEnabled,
                    externalPin,
                    hdVoiceEnabled,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    voice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            phoneNumbers()
            billingGroupId()
            connectionId()
            customerReference()
            deletionLockEnabled()
            externalPin()
            hdVoiceEnabled()
            tags()
            voice().ifPresent { it.validate() }
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
            (phoneNumbers.asKnown().getOrNull()?.size ?: 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (if (connectionId.asKnown().isPresent) 1 else 0) +
                (if (customerReference.asKnown().isPresent) 1 else 0) +
                (if (deletionLockEnabled.asKnown().isPresent) 1 else 0) +
                (if (externalPin.asKnown().isPresent) 1 else 0) +
                (if (hdVoiceEnabled.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (voice.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                phoneNumbers == other.phoneNumbers &&
                billingGroupId == other.billingGroupId &&
                connectionId == other.connectionId &&
                customerReference == other.customerReference &&
                deletionLockEnabled == other.deletionLockEnabled &&
                externalPin == other.externalPin &&
                hdVoiceEnabled == other.hdVoiceEnabled &&
                tags == other.tags &&
                voice == other.voice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                phoneNumbers,
                billingGroupId,
                connectionId,
                customerReference,
                deletionLockEnabled,
                externalPin,
                hdVoiceEnabled,
                tags,
                voice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{phoneNumbers=$phoneNumbers, billingGroupId=$billingGroupId, connectionId=$connectionId, customerReference=$customerReference, deletionLockEnabled=$deletionLockEnabled, externalPin=$externalPin, hdVoiceEnabled=$hdVoiceEnabled, tags=$tags, voice=$voice, additionalProperties=$additionalProperties}"
    }

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[has_bundle],
     * filter[tag], filter[connection_id], filter[phone_number], filter[status],
     * filter[voice.connection_name], filter[voice.usage_payment_method], filter[billing_group_id],
     * filter[emergency_address_id], filter[customer_reference]
     */
    class Filter
    private constructor(
        private val billingGroupId: String?,
        private val connectionId: String?,
        private val customerReference: String?,
        private val emergencyAddressId: String?,
        private val hasBundle: String?,
        private val phoneNumber: String?,
        private val status: Status?,
        private val tag: String?,
        private val voiceConnectionName: VoiceConnectionName?,
        private val voiceUsagePaymentMethod: VoiceUsagePaymentMethod?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Filter by the billing_group_id associated with phone numbers. To filter to only phone
         * numbers that have no billing group associated them, set the value of this filter to the
         * string 'null'.
         */
        fun billingGroupId(): Optional<String> = Optional.ofNullable(billingGroupId)

        /** Filter by connection_id. */
        fun connectionId(): Optional<String> = Optional.ofNullable(connectionId)

        /** Filter numbers via the customer_reference set. */
        fun customerReference(): Optional<String> = Optional.ofNullable(customerReference)

        /**
         * Filter by the emergency_address_id associated with phone numbers. To filter only phone
         * numbers that have no emergency address associated with them, set the value of this filter
         * to the string 'null'.
         */
        fun emergencyAddressId(): Optional<String> = Optional.ofNullable(emergencyAddressId)

        /** Filter by phone number that have bundles. */
        fun hasBundle(): Optional<String> = Optional.ofNullable(hasBundle)

        /**
         * Filter by phone number. Requires at least three digits. Non-numerical characters will
         * result in no values being returned.
         */
        fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

        /** Filter by phone number status. */
        fun status(): Optional<Status> = Optional.ofNullable(status)

        /** Filter by phone number tags. */
        fun tag(): Optional<String> = Optional.ofNullable(tag)

        /** Filter by voice connection name pattern matching. */
        fun voiceConnectionName(): Optional<VoiceConnectionName> =
            Optional.ofNullable(voiceConnectionName)

        /** Filter by usage_payment_method. */
        fun voiceUsagePaymentMethod(): Optional<VoiceUsagePaymentMethod> =
            Optional.ofNullable(voiceUsagePaymentMethod)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var billingGroupId: String? = null
            private var connectionId: String? = null
            private var customerReference: String? = null
            private var emergencyAddressId: String? = null
            private var hasBundle: String? = null
            private var phoneNumber: String? = null
            private var status: Status? = null
            private var tag: String? = null
            private var voiceConnectionName: VoiceConnectionName? = null
            private var voiceUsagePaymentMethod: VoiceUsagePaymentMethod? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                billingGroupId = filter.billingGroupId
                connectionId = filter.connectionId
                customerReference = filter.customerReference
                emergencyAddressId = filter.emergencyAddressId
                hasBundle = filter.hasBundle
                phoneNumber = filter.phoneNumber
                status = filter.status
                tag = filter.tag
                voiceConnectionName = filter.voiceConnectionName
                voiceUsagePaymentMethod = filter.voiceUsagePaymentMethod
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /**
             * Filter by the billing_group_id associated with phone numbers. To filter to only phone
             * numbers that have no billing group associated them, set the value of this filter to
             * the string 'null'.
             */
            fun billingGroupId(billingGroupId: String?) = apply {
                this.billingGroupId = billingGroupId
            }

            /** Alias for calling [Builder.billingGroupId] with `billingGroupId.orElse(null)`. */
            fun billingGroupId(billingGroupId: Optional<String>) =
                billingGroupId(billingGroupId.getOrNull())

            /** Filter by connection_id. */
            fun connectionId(connectionId: String?) = apply { this.connectionId = connectionId }

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<String>) =
                connectionId(connectionId.getOrNull())

            /** Filter numbers via the customer_reference set. */
            fun customerReference(customerReference: String?) = apply {
                this.customerReference = customerReference
            }

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

            /**
             * Filter by the emergency_address_id associated with phone numbers. To filter only
             * phone numbers that have no emergency address associated with them, set the value of
             * this filter to the string 'null'.
             */
            fun emergencyAddressId(emergencyAddressId: String?) = apply {
                this.emergencyAddressId = emergencyAddressId
            }

            /**
             * Alias for calling [Builder.emergencyAddressId] with
             * `emergencyAddressId.orElse(null)`.
             */
            fun emergencyAddressId(emergencyAddressId: Optional<String>) =
                emergencyAddressId(emergencyAddressId.getOrNull())

            /** Filter by phone number that have bundles. */
            fun hasBundle(hasBundle: String?) = apply { this.hasBundle = hasBundle }

            /** Alias for calling [Builder.hasBundle] with `hasBundle.orElse(null)`. */
            fun hasBundle(hasBundle: Optional<String>) = hasBundle(hasBundle.getOrNull())

            /**
             * Filter by phone number. Requires at least three digits. Non-numerical characters will
             * result in no values being returned.
             */
            fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

            /** Filter by phone number status. */
            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /** Filter by phone number tags. */
            fun tag(tag: String?) = apply { this.tag = tag }

            /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
            fun tag(tag: Optional<String>) = tag(tag.getOrNull())

            /** Filter by voice connection name pattern matching. */
            fun voiceConnectionName(voiceConnectionName: VoiceConnectionName?) = apply {
                this.voiceConnectionName = voiceConnectionName
            }

            /**
             * Alias for calling [Builder.voiceConnectionName] with
             * `voiceConnectionName.orElse(null)`.
             */
            fun voiceConnectionName(voiceConnectionName: Optional<VoiceConnectionName>) =
                voiceConnectionName(voiceConnectionName.getOrNull())

            /** Filter by usage_payment_method. */
            fun voiceUsagePaymentMethod(voiceUsagePaymentMethod: VoiceUsagePaymentMethod?) = apply {
                this.voiceUsagePaymentMethod = voiceUsagePaymentMethod
            }

            /**
             * Alias for calling [Builder.voiceUsagePaymentMethod] with
             * `voiceUsagePaymentMethod.orElse(null)`.
             */
            fun voiceUsagePaymentMethod(
                voiceUsagePaymentMethod: Optional<VoiceUsagePaymentMethod>
            ) = voiceUsagePaymentMethod(voiceUsagePaymentMethod.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter =
                Filter(
                    billingGroupId,
                    connectionId,
                    customerReference,
                    emergencyAddressId,
                    hasBundle,
                    phoneNumber,
                    status,
                    tag,
                    voiceConnectionName,
                    voiceUsagePaymentMethod,
                    additionalProperties.build(),
                )
        }

        /** Filter by phone number status. */
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

                @JvmField val PURCHASE_PENDING = of("purchase-pending")

                @JvmField val PURCHASE_FAILED = of("purchase-failed")

                @JvmField val PORT_PENDING = of("port-pending")

                @JvmField val ACTIVE = of("active")

                @JvmField val DELETED = of("deleted")

                @JvmField val PORT_FAILED = of("port-failed")

                @JvmField val EMERGENCY_ONLY = of("emergency-only")

                @JvmField val PORTED_OUT = of("ported-out")

                @JvmField val PORT_OUT_PENDING = of("port-out-pending")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PURCHASE_PENDING,
                PURCHASE_FAILED,
                PORT_PENDING,
                ACTIVE,
                DELETED,
                PORT_FAILED,
                EMERGENCY_ONLY,
                PORTED_OUT,
                PORT_OUT_PENDING,
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
                PURCHASE_PENDING,
                PURCHASE_FAILED,
                PORT_PENDING,
                ACTIVE,
                DELETED,
                PORT_FAILED,
                EMERGENCY_ONLY,
                PORTED_OUT,
                PORT_OUT_PENDING,
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
                    PURCHASE_PENDING -> Value.PURCHASE_PENDING
                    PURCHASE_FAILED -> Value.PURCHASE_FAILED
                    PORT_PENDING -> Value.PORT_PENDING
                    ACTIVE -> Value.ACTIVE
                    DELETED -> Value.DELETED
                    PORT_FAILED -> Value.PORT_FAILED
                    EMERGENCY_ONLY -> Value.EMERGENCY_ONLY
                    PORTED_OUT -> Value.PORTED_OUT
                    PORT_OUT_PENDING -> Value.PORT_OUT_PENDING
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
                    PURCHASE_PENDING -> Known.PURCHASE_PENDING
                    PURCHASE_FAILED -> Known.PURCHASE_FAILED
                    PORT_PENDING -> Known.PORT_PENDING
                    ACTIVE -> Known.ACTIVE
                    DELETED -> Known.DELETED
                    PORT_FAILED -> Known.PORT_FAILED
                    EMERGENCY_ONLY -> Known.EMERGENCY_ONLY
                    PORTED_OUT -> Known.PORTED_OUT
                    PORT_OUT_PENDING -> Known.PORT_OUT_PENDING
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

        /** Filter by voice connection name pattern matching. */
        class VoiceConnectionName
        private constructor(
            private val contains: String?,
            private val endsWith: String?,
            private val eq: String?,
            private val startsWith: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter contains connection name. Requires at least three characters. */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Filter ends with connection name. Requires at least three characters. */
            fun endsWith(): Optional<String> = Optional.ofNullable(endsWith)

            /** Filter by connection name. */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Filter starts with connection name. Requires at least three characters. */
            fun startsWith(): Optional<String> = Optional.ofNullable(startsWith)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [VoiceConnectionName].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VoiceConnectionName]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var endsWith: String? = null
                private var eq: String? = null
                private var startsWith: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(voiceConnectionName: VoiceConnectionName) = apply {
                    contains = voiceConnectionName.contains
                    endsWith = voiceConnectionName.endsWith
                    eq = voiceConnectionName.eq
                    startsWith = voiceConnectionName.startsWith
                    additionalProperties = voiceConnectionName.additionalProperties.toBuilder()
                }

                /** Filter contains connection name. Requires at least three characters. */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /** Filter ends with connection name. Requires at least three characters. */
                fun endsWith(endsWith: String?) = apply { this.endsWith = endsWith }

                /** Alias for calling [Builder.endsWith] with `endsWith.orElse(null)`. */
                fun endsWith(endsWith: Optional<String>) = endsWith(endsWith.getOrNull())

                /** Filter by connection name. */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /** Filter starts with connection name. Requires at least three characters. */
                fun startsWith(startsWith: String?) = apply { this.startsWith = startsWith }

                /** Alias for calling [Builder.startsWith] with `startsWith.orElse(null)`. */
                fun startsWith(startsWith: Optional<String>) = startsWith(startsWith.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                fun putAdditionalProperty(key: String, value: String) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                    additionalProperties.put(key, values)
                }

                fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                fun replaceAdditionalProperties(key: String, value: String) = apply {
                    additionalProperties.replace(key, value)
                }

                fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                    additionalProperties.replace(key, values)
                }

                fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.replaceAll(additionalProperties)
                }

                fun replaceAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [VoiceConnectionName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VoiceConnectionName =
                    VoiceConnectionName(
                        contains,
                        endsWith,
                        eq,
                        startsWith,
                        additionalProperties.build(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VoiceConnectionName &&
                    contains == other.contains &&
                    endsWith == other.endsWith &&
                    eq == other.eq &&
                    startsWith == other.startsWith &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contains, endsWith, eq, startsWith, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VoiceConnectionName{contains=$contains, endsWith=$endsWith, eq=$eq, startsWith=$startsWith, additionalProperties=$additionalProperties}"
        }

        /** Filter by usage_payment_method. */
        class VoiceUsagePaymentMethod
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

                @JvmField val PAY_PER_MINUTE = of("pay-per-minute")

                @JvmField val CHANNEL = of("channel")

                @JvmStatic fun of(value: String) = VoiceUsagePaymentMethod(JsonField.of(value))
            }

            /** An enum containing [VoiceUsagePaymentMethod]'s known values. */
            enum class Known {
                PAY_PER_MINUTE,
                CHANNEL,
            }

            /**
             * An enum containing [VoiceUsagePaymentMethod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [VoiceUsagePaymentMethod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAY_PER_MINUTE,
                CHANNEL,
                /**
                 * An enum member indicating that [VoiceUsagePaymentMethod] was instantiated with an
                 * unknown value.
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
                    PAY_PER_MINUTE -> Value.PAY_PER_MINUTE
                    CHANNEL -> Value.CHANNEL
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
                    PAY_PER_MINUTE -> Known.PAY_PER_MINUTE
                    CHANNEL -> Known.CHANNEL
                    else ->
                        throw TelnyxInvalidDataException("Unknown VoiceUsagePaymentMethod: $value")
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

            fun validate(): VoiceUsagePaymentMethod = apply {
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

                return other is VoiceUsagePaymentMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                billingGroupId == other.billingGroupId &&
                connectionId == other.connectionId &&
                customerReference == other.customerReference &&
                emergencyAddressId == other.emergencyAddressId &&
                hasBundle == other.hasBundle &&
                phoneNumber == other.phoneNumber &&
                status == other.status &&
                tag == other.tag &&
                voiceConnectionName == other.voiceConnectionName &&
                voiceUsagePaymentMethod == other.voiceUsagePaymentMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingGroupId,
                connectionId,
                customerReference,
                emergencyAddressId,
                hasBundle,
                phoneNumber,
                status,
                tag,
                voiceConnectionName,
                voiceUsagePaymentMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{billingGroupId=$billingGroupId, connectionId=$connectionId, customerReference=$customerReference, emergencyAddressId=$emergencyAddressId, hasBundle=$hasBundle, phoneNumber=$phoneNumber, status=$status, tag=$tag, voiceConnectionName=$voiceConnectionName, voiceUsagePaymentMethod=$voiceUsagePaymentMethod, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JobUpdateBatchParams &&
            filter == other.filter &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "JobUpdateBatchParams{filter=$filter, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
