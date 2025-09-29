// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.outboundvoiceprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OutboundVoiceProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<String>,
    private val id: JsonField<String>,
    private val billingGroupId: JsonField<String>,
    private val callRecording: JsonField<OutboundCallRecording>,
    private val concurrentCallLimit: JsonField<Long>,
    private val connectionsCount: JsonField<Long>,
    private val createdAt: JsonField<String>,
    private val dailySpendLimit: JsonField<String>,
    private val dailySpendLimitEnabled: JsonField<Boolean>,
    private val enabled: JsonField<Boolean>,
    private val maxDestinationRate: JsonField<Double>,
    private val recordType: JsonField<String>,
    private val servicePlan: JsonField<ServicePlan>,
    private val tags: JsonField<List<String>>,
    private val trafficType: JsonField<TrafficType>,
    private val updatedAt: JsonField<String>,
    private val usagePaymentMethod: JsonField<UsagePaymentMethod>,
    private val whitelistedDestinations: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        billingGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("call_recording")
        @ExcludeMissing
        callRecording: JsonField<OutboundCallRecording> = JsonMissing.of(),
        @JsonProperty("concurrent_call_limit")
        @ExcludeMissing
        concurrentCallLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("connections_count")
        @ExcludeMissing
        connectionsCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily_spend_limit")
        @ExcludeMissing
        dailySpendLimit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily_spend_limit_enabled")
        @ExcludeMissing
        dailySpendLimitEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("max_destination_rate")
        @ExcludeMissing
        maxDestinationRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("service_plan")
        @ExcludeMissing
        servicePlan: JsonField<ServicePlan> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("traffic_type")
        @ExcludeMissing
        trafficType: JsonField<TrafficType> = JsonMissing.of(),
        @JsonProperty("updated_at") @ExcludeMissing updatedAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage_payment_method")
        @ExcludeMissing
        usagePaymentMethod: JsonField<UsagePaymentMethod> = JsonMissing.of(),
        @JsonProperty("whitelisted_destinations")
        @ExcludeMissing
        whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        name,
        id,
        billingGroupId,
        callRecording,
        concurrentCallLimit,
        connectionsCount,
        createdAt,
        dailySpendLimit,
        dailySpendLimitEnabled,
        enabled,
        maxDestinationRate,
        recordType,
        servicePlan,
        tags,
        trafficType,
        updatedAt,
        usagePaymentMethod,
        whitelistedDestinations,
        mutableMapOf(),
    )

    /**
     * A user-supplied name to help with organization.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Identifies the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The ID of the billing group associated with the outbound proflile. Defaults to null (for no
     * group assigned).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = billingGroupId.getOptional("billing_group_id")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecording(): Optional<OutboundCallRecording> =
        callRecording.getOptional("call_recording")

    /**
     * Must be no more than your global concurrent call limit. Null means no limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun concurrentCallLimit(): Optional<Long> =
        concurrentCallLimit.getOptional("concurrent_call_limit")

    /**
     * Amount of connections associated with this outbound voice profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connectionsCount(): Optional<Long> = connectionsCount.getOptional("connections_count")

    /**
     * ISO 8601 formatted date-time indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

    /**
     * The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound voice
     * profile in a day before disallowing new calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimit(): Optional<String> = dailySpendLimit.getOptional("daily_spend_limit")

    /**
     * Specifies whether to enforce the daily_spend_limit on this outbound voice profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimitEnabled(): Optional<Boolean> =
        dailySpendLimitEnabled.getOptional("daily_spend_limit_enabled")

    /**
     * Specifies whether the outbound voice profile can be used. Disabled profiles will result in
     * outbound calls being blocked for the associated Connections.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * Maximum rate (price per minute) for a Destination to be allowed when making outbound calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxDestinationRate(): Optional<Double> =
        maxDestinationRate.getOptional("max_destination_rate")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<String> = recordType.getOptional("record_type")

    /**
     * Indicates the coverage of the termination regions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun servicePlan(): Optional<ServicePlan> = servicePlan.getOptional("service_plan")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Specifies the type of traffic allowed in this profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trafficType(): Optional<TrafficType> = trafficType.getOptional("traffic_type")

    /**
     * ISO 8601 formatted date-time indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<String> = updatedAt.getOptional("updated_at")

    /**
     * Setting for how costs for outbound profile are calculated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usagePaymentMethod(): Optional<UsagePaymentMethod> =
        usagePaymentMethod.getOptional("usage_payment_method")

    /**
     * The list of destinations you want to be able to call using this outbound voice profile
     * formatted in alpha2.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whitelistedDestinations(): Optional<List<String>> =
        whitelistedDestinations.getOptional("whitelisted_destinations")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_group_id")
    @ExcludeMissing
    fun _billingGroupId(): JsonField<String> = billingGroupId

    /**
     * Returns the raw JSON value of [callRecording].
     *
     * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("call_recording")
    @ExcludeMissing
    fun _callRecording(): JsonField<OutboundCallRecording> = callRecording

    /**
     * Returns the raw JSON value of [concurrentCallLimit].
     *
     * Unlike [concurrentCallLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("concurrent_call_limit")
    @ExcludeMissing
    fun _concurrentCallLimit(): JsonField<Long> = concurrentCallLimit

    /**
     * Returns the raw JSON value of [connectionsCount].
     *
     * Unlike [connectionsCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connections_count")
    @ExcludeMissing
    fun _connectionsCount(): JsonField<Long> = connectionsCount

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [dailySpendLimit].
     *
     * Unlike [dailySpendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daily_spend_limit")
    @ExcludeMissing
    fun _dailySpendLimit(): JsonField<String> = dailySpendLimit

    /**
     * Returns the raw JSON value of [dailySpendLimitEnabled].
     *
     * Unlike [dailySpendLimitEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("daily_spend_limit_enabled")
    @ExcludeMissing
    fun _dailySpendLimitEnabled(): JsonField<Boolean> = dailySpendLimitEnabled

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [maxDestinationRate].
     *
     * Unlike [maxDestinationRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("max_destination_rate")
    @ExcludeMissing
    fun _maxDestinationRate(): JsonField<Double> = maxDestinationRate

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type") @ExcludeMissing fun _recordType(): JsonField<String> = recordType

    /**
     * Returns the raw JSON value of [servicePlan].
     *
     * Unlike [servicePlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service_plan")
    @ExcludeMissing
    fun _servicePlan(): JsonField<ServicePlan> = servicePlan

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [trafficType].
     *
     * Unlike [trafficType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("traffic_type")
    @ExcludeMissing
    fun _trafficType(): JsonField<TrafficType> = trafficType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt(): JsonField<String> = updatedAt

    /**
     * Returns the raw JSON value of [usagePaymentMethod].
     *
     * Unlike [usagePaymentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usage_payment_method")
    @ExcludeMissing
    fun _usagePaymentMethod(): JsonField<UsagePaymentMethod> = usagePaymentMethod

    /**
     * Returns the raw JSON value of [whitelistedDestinations].
     *
     * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("whitelisted_destinations")
    @ExcludeMissing
    fun _whitelistedDestinations(): JsonField<List<String>> = whitelistedDestinations

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
         * Returns a mutable builder for constructing an instance of [OutboundVoiceProfile].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OutboundVoiceProfile]. */
    class Builder internal constructor() {

        private var name: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var billingGroupId: JsonField<String> = JsonMissing.of()
        private var callRecording: JsonField<OutboundCallRecording> = JsonMissing.of()
        private var concurrentCallLimit: JsonField<Long> = JsonMissing.of()
        private var connectionsCount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<String> = JsonMissing.of()
        private var dailySpendLimit: JsonField<String> = JsonMissing.of()
        private var dailySpendLimitEnabled: JsonField<Boolean> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var maxDestinationRate: JsonField<Double> = JsonMissing.of()
        private var recordType: JsonField<String> = JsonMissing.of()
        private var servicePlan: JsonField<ServicePlan> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var trafficType: JsonField<TrafficType> = JsonMissing.of()
        private var updatedAt: JsonField<String> = JsonMissing.of()
        private var usagePaymentMethod: JsonField<UsagePaymentMethod> = JsonMissing.of()
        private var whitelistedDestinations: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(outboundVoiceProfile: OutboundVoiceProfile) = apply {
            name = outboundVoiceProfile.name
            id = outboundVoiceProfile.id
            billingGroupId = outboundVoiceProfile.billingGroupId
            callRecording = outboundVoiceProfile.callRecording
            concurrentCallLimit = outboundVoiceProfile.concurrentCallLimit
            connectionsCount = outboundVoiceProfile.connectionsCount
            createdAt = outboundVoiceProfile.createdAt
            dailySpendLimit = outboundVoiceProfile.dailySpendLimit
            dailySpendLimitEnabled = outboundVoiceProfile.dailySpendLimitEnabled
            enabled = outboundVoiceProfile.enabled
            maxDestinationRate = outboundVoiceProfile.maxDestinationRate
            recordType = outboundVoiceProfile.recordType
            servicePlan = outboundVoiceProfile.servicePlan
            tags = outboundVoiceProfile.tags.map { it.toMutableList() }
            trafficType = outboundVoiceProfile.trafficType
            updatedAt = outboundVoiceProfile.updatedAt
            usagePaymentMethod = outboundVoiceProfile.usagePaymentMethod
            whitelistedDestinations =
                outboundVoiceProfile.whitelistedDestinations.map { it.toMutableList() }
            additionalProperties = outboundVoiceProfile.additionalProperties.toMutableMap()
        }

        /** A user-supplied name to help with organization. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Identifies the resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The ID of the billing group associated with the outbound proflile. Defaults to null (for
         * no group assigned).
         */
        fun billingGroupId(billingGroupId: String?) =
            billingGroupId(JsonField.ofNullable(billingGroupId))

        /** Alias for calling [Builder.billingGroupId] with `billingGroupId.orElse(null)`. */
        fun billingGroupId(billingGroupId: Optional<String>) =
            billingGroupId(billingGroupId.getOrNull())

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

        fun callRecording(callRecording: OutboundCallRecording) =
            callRecording(JsonField.of(callRecording))

        /**
         * Sets [Builder.callRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecording] with a well-typed [OutboundCallRecording]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callRecording(callRecording: JsonField<OutboundCallRecording>) = apply {
            this.callRecording = callRecording
        }

        /** Must be no more than your global concurrent call limit. Null means no limit. */
        fun concurrentCallLimit(concurrentCallLimit: Long?) =
            concurrentCallLimit(JsonField.ofNullable(concurrentCallLimit))

        /**
         * Alias for [Builder.concurrentCallLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun concurrentCallLimit(concurrentCallLimit: Long) =
            concurrentCallLimit(concurrentCallLimit as Long?)

        /**
         * Alias for calling [Builder.concurrentCallLimit] with `concurrentCallLimit.orElse(null)`.
         */
        fun concurrentCallLimit(concurrentCallLimit: Optional<Long>) =
            concurrentCallLimit(concurrentCallLimit.getOrNull())

        /**
         * Sets [Builder.concurrentCallLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.concurrentCallLimit] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun concurrentCallLimit(concurrentCallLimit: JsonField<Long>) = apply {
            this.concurrentCallLimit = concurrentCallLimit
        }

        /** Amount of connections associated with this outbound voice profile. */
        fun connectionsCount(connectionsCount: Long) =
            connectionsCount(JsonField.of(connectionsCount))

        /**
         * Sets [Builder.connectionsCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectionsCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectionsCount(connectionsCount: JsonField<Long>) = apply {
            this.connectionsCount = connectionsCount
        }

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

        /**
         * The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound
         * voice profile in a day before disallowing new calls.
         */
        fun dailySpendLimit(dailySpendLimit: String) =
            dailySpendLimit(JsonField.of(dailySpendLimit))

        /**
         * Sets [Builder.dailySpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailySpendLimit(dailySpendLimit: JsonField<String>) = apply {
            this.dailySpendLimit = dailySpendLimit
        }

        /** Specifies whether to enforce the daily_spend_limit on this outbound voice profile. */
        fun dailySpendLimitEnabled(dailySpendLimitEnabled: Boolean) =
            dailySpendLimitEnabled(JsonField.of(dailySpendLimitEnabled))

        /**
         * Sets [Builder.dailySpendLimitEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimitEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dailySpendLimitEnabled(dailySpendLimitEnabled: JsonField<Boolean>) = apply {
            this.dailySpendLimitEnabled = dailySpendLimitEnabled
        }

        /**
         * Specifies whether the outbound voice profile can be used. Disabled profiles will result
         * in outbound calls being blocked for the associated Connections.
         */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * Maximum rate (price per minute) for a Destination to be allowed when making outbound
         * calls.
         */
        fun maxDestinationRate(maxDestinationRate: Double) =
            maxDestinationRate(JsonField.of(maxDestinationRate))

        /**
         * Sets [Builder.maxDestinationRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDestinationRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxDestinationRate(maxDestinationRate: JsonField<Double>) = apply {
            this.maxDestinationRate = maxDestinationRate
        }

        /** Identifies the type of the resource. */
        fun recordType(recordType: String) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recordType(recordType: JsonField<String>) = apply { this.recordType = recordType }

        /** Indicates the coverage of the termination regions. */
        fun servicePlan(servicePlan: ServicePlan) = servicePlan(JsonField.of(servicePlan))

        /**
         * Sets [Builder.servicePlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servicePlan] with a well-typed [ServicePlan] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun servicePlan(servicePlan: JsonField<ServicePlan>) = apply {
            this.servicePlan = servicePlan
        }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Specifies the type of traffic allowed in this profile. */
        fun trafficType(trafficType: TrafficType) = trafficType(JsonField.of(trafficType))

        /**
         * Sets [Builder.trafficType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trafficType] with a well-typed [TrafficType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trafficType(trafficType: JsonField<TrafficType>) = apply {
            this.trafficType = trafficType
        }

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

        /** Setting for how costs for outbound profile are calculated. */
        fun usagePaymentMethod(usagePaymentMethod: UsagePaymentMethod) =
            usagePaymentMethod(JsonField.of(usagePaymentMethod))

        /**
         * Sets [Builder.usagePaymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usagePaymentMethod] with a well-typed
         * [UsagePaymentMethod] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun usagePaymentMethod(usagePaymentMethod: JsonField<UsagePaymentMethod>) = apply {
            this.usagePaymentMethod = usagePaymentMethod
        }

        /**
         * The list of destinations you want to be able to call using this outbound voice profile
         * formatted in alpha2.
         */
        fun whitelistedDestinations(whitelistedDestinations: List<String>) =
            whitelistedDestinations(JsonField.of(whitelistedDestinations))

        /**
         * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whitelistedDestinations] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
            this.whitelistedDestinations = whitelistedDestinations.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [whitelistedDestinations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWhitelistedDestination(whitelistedDestination: String) = apply {
            whitelistedDestinations =
                (whitelistedDestinations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("whitelistedDestinations", it).add(whitelistedDestination)
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
         * Returns an immutable instance of [OutboundVoiceProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OutboundVoiceProfile =
            OutboundVoiceProfile(
                checkRequired("name", name),
                id,
                billingGroupId,
                callRecording,
                concurrentCallLimit,
                connectionsCount,
                createdAt,
                dailySpendLimit,
                dailySpendLimitEnabled,
                enabled,
                maxDestinationRate,
                recordType,
                servicePlan,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                trafficType,
                updatedAt,
                usagePaymentMethod,
                (whitelistedDestinations ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OutboundVoiceProfile = apply {
        if (validated) {
            return@apply
        }

        name()
        id()
        billingGroupId()
        callRecording().ifPresent { it.validate() }
        concurrentCallLimit()
        connectionsCount()
        createdAt()
        dailySpendLimit()
        dailySpendLimitEnabled()
        enabled()
        maxDestinationRate()
        recordType()
        servicePlan().ifPresent { it.validate() }
        tags()
        trafficType().ifPresent { it.validate() }
        updatedAt()
        usagePaymentMethod().ifPresent { it.validate() }
        whitelistedDestinations()
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
        (if (name.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (billingGroupId.asKnown().isPresent) 1 else 0) +
            (callRecording.asKnown().getOrNull()?.validity() ?: 0) +
            (if (concurrentCallLimit.asKnown().isPresent) 1 else 0) +
            (if (connectionsCount.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (dailySpendLimit.asKnown().isPresent) 1 else 0) +
            (if (dailySpendLimitEnabled.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (maxDestinationRate.asKnown().isPresent) 1 else 0) +
            (if (recordType.asKnown().isPresent) 1 else 0) +
            (servicePlan.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (trafficType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (usagePaymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutboundVoiceProfile &&
            name == other.name &&
            id == other.id &&
            billingGroupId == other.billingGroupId &&
            callRecording == other.callRecording &&
            concurrentCallLimit == other.concurrentCallLimit &&
            connectionsCount == other.connectionsCount &&
            createdAt == other.createdAt &&
            dailySpendLimit == other.dailySpendLimit &&
            dailySpendLimitEnabled == other.dailySpendLimitEnabled &&
            enabled == other.enabled &&
            maxDestinationRate == other.maxDestinationRate &&
            recordType == other.recordType &&
            servicePlan == other.servicePlan &&
            tags == other.tags &&
            trafficType == other.trafficType &&
            updatedAt == other.updatedAt &&
            usagePaymentMethod == other.usagePaymentMethod &&
            whitelistedDestinations == other.whitelistedDestinations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            name,
            id,
            billingGroupId,
            callRecording,
            concurrentCallLimit,
            connectionsCount,
            createdAt,
            dailySpendLimit,
            dailySpendLimitEnabled,
            enabled,
            maxDestinationRate,
            recordType,
            servicePlan,
            tags,
            trafficType,
            updatedAt,
            usagePaymentMethod,
            whitelistedDestinations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OutboundVoiceProfile{name=$name, id=$id, billingGroupId=$billingGroupId, callRecording=$callRecording, concurrentCallLimit=$concurrentCallLimit, connectionsCount=$connectionsCount, createdAt=$createdAt, dailySpendLimit=$dailySpendLimit, dailySpendLimitEnabled=$dailySpendLimitEnabled, enabled=$enabled, maxDestinationRate=$maxDestinationRate, recordType=$recordType, servicePlan=$servicePlan, tags=$tags, trafficType=$trafficType, updatedAt=$updatedAt, usagePaymentMethod=$usagePaymentMethod, whitelistedDestinations=$whitelistedDestinations, additionalProperties=$additionalProperties}"
}
