// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.outboundvoiceprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Create an outbound voice profile. */
class OutboundVoiceProfileCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A user-supplied name to help with organization.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * The ID of the billing group associated with the outbound proflile. Defaults to null (for no
     * group assigned).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingGroupId(): Optional<String> = body.billingGroupId()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callRecording(): Optional<OutboundCallRecording> = body.callRecording()

    /**
     * Must be no more than your global concurrent call limit. Null means no limit.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun concurrentCallLimit(): Optional<Long> = body.concurrentCallLimit()

    /**
     * The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound voice
     * profile in a day before disallowing new calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimit(): Optional<String> = body.dailySpendLimit()

    /**
     * Specifies whether to enforce the daily_spend_limit on this outbound voice profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimitEnabled(): Optional<Boolean> = body.dailySpendLimitEnabled()

    /**
     * Specifies whether the outbound voice profile can be used. Disabled profiles will result in
     * outbound calls being blocked for the associated Connections.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = body.enabled()

    /**
     * Maximum rate (price per minute) for a Destination to be allowed when making outbound calls.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxDestinationRate(): Optional<Double> = body.maxDestinationRate()

    /**
     * Indicates the coverage of the termination regions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun servicePlan(): Optional<ServicePlan> = body.servicePlan()

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Specifies the type of traffic allowed in this profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trafficType(): Optional<TrafficType> = body.trafficType()

    /**
     * Setting for how costs for outbound profile are calculated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usagePaymentMethod(): Optional<UsagePaymentMethod> = body.usagePaymentMethod()

    /**
     * The list of destinations you want to be able to call using this outbound voice profile
     * formatted in alpha2.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whitelistedDestinations(): Optional<List<String>> = body.whitelistedDestinations()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [billingGroupId].
     *
     * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingGroupId(): JsonField<String> = body._billingGroupId()

    /**
     * Returns the raw JSON value of [callRecording].
     *
     * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callRecording(): JsonField<OutboundCallRecording> = body._callRecording()

    /**
     * Returns the raw JSON value of [concurrentCallLimit].
     *
     * Unlike [concurrentCallLimit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _concurrentCallLimit(): JsonField<Long> = body._concurrentCallLimit()

    /**
     * Returns the raw JSON value of [dailySpendLimit].
     *
     * Unlike [dailySpendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dailySpendLimit(): JsonField<String> = body._dailySpendLimit()

    /**
     * Returns the raw JSON value of [dailySpendLimitEnabled].
     *
     * Unlike [dailySpendLimitEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _dailySpendLimitEnabled(): JsonField<Boolean> = body._dailySpendLimitEnabled()

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabled(): JsonField<Boolean> = body._enabled()

    /**
     * Returns the raw JSON value of [maxDestinationRate].
     *
     * Unlike [maxDestinationRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _maxDestinationRate(): JsonField<Double> = body._maxDestinationRate()

    /**
     * Returns the raw JSON value of [servicePlan].
     *
     * Unlike [servicePlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _servicePlan(): JsonField<ServicePlan> = body._servicePlan()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [trafficType].
     *
     * Unlike [trafficType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trafficType(): JsonField<TrafficType> = body._trafficType()

    /**
     * Returns the raw JSON value of [usagePaymentMethod].
     *
     * Unlike [usagePaymentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _usagePaymentMethod(): JsonField<UsagePaymentMethod> = body._usagePaymentMethod()

    /**
     * Returns the raw JSON value of [whitelistedDestinations].
     *
     * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _whitelistedDestinations(): JsonField<List<String>> = body._whitelistedDestinations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OutboundVoiceProfileCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OutboundVoiceProfileCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(outboundVoiceProfileCreateParams: OutboundVoiceProfileCreateParams) =
            apply {
                body = outboundVoiceProfileCreateParams.body.toBuilder()
                additionalHeaders = outboundVoiceProfileCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    outboundVoiceProfileCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [billingGroupId]
         * - [callRecording]
         * - [concurrentCallLimit]
         * - [dailySpendLimit]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A user-supplied name to help with organization. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The ID of the billing group associated with the outbound proflile. Defaults to null (for
         * no group assigned).
         */
        fun billingGroupId(billingGroupId: String?) = apply { body.billingGroupId(billingGroupId) }

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
            body.billingGroupId(billingGroupId)
        }

        fun callRecording(callRecording: OutboundCallRecording) = apply {
            body.callRecording(callRecording)
        }

        /**
         * Sets [Builder.callRecording] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callRecording] with a well-typed [OutboundCallRecording]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callRecording(callRecording: JsonField<OutboundCallRecording>) = apply {
            body.callRecording(callRecording)
        }

        /** Must be no more than your global concurrent call limit. Null means no limit. */
        fun concurrentCallLimit(concurrentCallLimit: Long?) = apply {
            body.concurrentCallLimit(concurrentCallLimit)
        }

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
            body.concurrentCallLimit(concurrentCallLimit)
        }

        /**
         * The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound
         * voice profile in a day before disallowing new calls.
         */
        fun dailySpendLimit(dailySpendLimit: String) = apply {
            body.dailySpendLimit(dailySpendLimit)
        }

        /**
         * Sets [Builder.dailySpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailySpendLimit(dailySpendLimit: JsonField<String>) = apply {
            body.dailySpendLimit(dailySpendLimit)
        }

        /** Specifies whether to enforce the daily_spend_limit on this outbound voice profile. */
        fun dailySpendLimitEnabled(dailySpendLimitEnabled: Boolean) = apply {
            body.dailySpendLimitEnabled(dailySpendLimitEnabled)
        }

        /**
         * Sets [Builder.dailySpendLimitEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimitEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dailySpendLimitEnabled(dailySpendLimitEnabled: JsonField<Boolean>) = apply {
            body.dailySpendLimitEnabled(dailySpendLimitEnabled)
        }

        /**
         * Specifies whether the outbound voice profile can be used. Disabled profiles will result
         * in outbound calls being blocked for the associated Connections.
         */
        fun enabled(enabled: Boolean) = apply { body.enabled(enabled) }

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { body.enabled(enabled) }

        /**
         * Maximum rate (price per minute) for a Destination to be allowed when making outbound
         * calls.
         */
        fun maxDestinationRate(maxDestinationRate: Double) = apply {
            body.maxDestinationRate(maxDestinationRate)
        }

        /**
         * Sets [Builder.maxDestinationRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDestinationRate] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxDestinationRate(maxDestinationRate: JsonField<Double>) = apply {
            body.maxDestinationRate(maxDestinationRate)
        }

        /** Indicates the coverage of the termination regions. */
        fun servicePlan(servicePlan: ServicePlan) = apply { body.servicePlan(servicePlan) }

        /**
         * Sets [Builder.servicePlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servicePlan] with a well-typed [ServicePlan] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun servicePlan(servicePlan: JsonField<ServicePlan>) = apply {
            body.servicePlan(servicePlan)
        }

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

        /** Specifies the type of traffic allowed in this profile. */
        fun trafficType(trafficType: TrafficType) = apply { body.trafficType(trafficType) }

        /**
         * Sets [Builder.trafficType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trafficType] with a well-typed [TrafficType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trafficType(trafficType: JsonField<TrafficType>) = apply {
            body.trafficType(trafficType)
        }

        /** Setting for how costs for outbound profile are calculated. */
        fun usagePaymentMethod(usagePaymentMethod: UsagePaymentMethod) = apply {
            body.usagePaymentMethod(usagePaymentMethod)
        }

        /**
         * Sets [Builder.usagePaymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usagePaymentMethod] with a well-typed
         * [UsagePaymentMethod] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun usagePaymentMethod(usagePaymentMethod: JsonField<UsagePaymentMethod>) = apply {
            body.usagePaymentMethod(usagePaymentMethod)
        }

        /**
         * The list of destinations you want to be able to call using this outbound voice profile
         * formatted in alpha2.
         */
        fun whitelistedDestinations(whitelistedDestinations: List<String>) = apply {
            body.whitelistedDestinations(whitelistedDestinations)
        }

        /**
         * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whitelistedDestinations] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
            body.whitelistedDestinations(whitelistedDestinations)
        }

        /**
         * Adds a single [String] to [whitelistedDestinations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWhitelistedDestination(whitelistedDestination: String) = apply {
            body.addWhitelistedDestination(whitelistedDestination)
        }

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
         * Returns an immutable instance of [OutboundVoiceProfileCreateParams].
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
        fun build(): OutboundVoiceProfileCreateParams =
            OutboundVoiceProfileCreateParams(
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
        private val name: JsonField<String>,
        private val billingGroupId: JsonField<String>,
        private val callRecording: JsonField<OutboundCallRecording>,
        private val concurrentCallLimit: JsonField<Long>,
        private val dailySpendLimit: JsonField<String>,
        private val dailySpendLimitEnabled: JsonField<Boolean>,
        private val enabled: JsonField<Boolean>,
        private val maxDestinationRate: JsonField<Double>,
        private val servicePlan: JsonField<ServicePlan>,
        private val tags: JsonField<List<String>>,
        private val trafficType: JsonField<TrafficType>,
        private val usagePaymentMethod: JsonField<UsagePaymentMethod>,
        private val whitelistedDestinations: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_group_id")
            @ExcludeMissing
            billingGroupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("call_recording")
            @ExcludeMissing
            callRecording: JsonField<OutboundCallRecording> = JsonMissing.of(),
            @JsonProperty("concurrent_call_limit")
            @ExcludeMissing
            concurrentCallLimit: JsonField<Long> = JsonMissing.of(),
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
            @JsonProperty("service_plan")
            @ExcludeMissing
            servicePlan: JsonField<ServicePlan> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("traffic_type")
            @ExcludeMissing
            trafficType: JsonField<TrafficType> = JsonMissing.of(),
            @JsonProperty("usage_payment_method")
            @ExcludeMissing
            usagePaymentMethod: JsonField<UsagePaymentMethod> = JsonMissing.of(),
            @JsonProperty("whitelisted_destinations")
            @ExcludeMissing
            whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            name,
            billingGroupId,
            callRecording,
            concurrentCallLimit,
            dailySpendLimit,
            dailySpendLimitEnabled,
            enabled,
            maxDestinationRate,
            servicePlan,
            tags,
            trafficType,
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
         * The ID of the billing group associated with the outbound proflile. Defaults to null (for
         * no group assigned).
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
         * The maximum amount of usage charges, in USD, you want Telnyx to allow on this outbound
         * voice profile in a day before disallowing new calls.
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
         * Specifies whether the outbound voice profile can be used. Disabled profiles will result
         * in outbound calls being blocked for the associated Connections.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

        /**
         * Maximum rate (price per minute) for a Destination to be allowed when making outbound
         * calls.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxDestinationRate(): Optional<Double> =
            maxDestinationRate.getOptional("max_destination_rate")

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
         * Returns the raw JSON value of [billingGroupId].
         *
         * Unlike [billingGroupId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_group_id")
        @ExcludeMissing
        fun _billingGroupId(): JsonField<String> = billingGroupId

        /**
         * Returns the raw JSON value of [callRecording].
         *
         * Unlike [callRecording], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("call_recording")
        @ExcludeMissing
        fun _callRecording(): JsonField<OutboundCallRecording> = callRecording

        /**
         * Returns the raw JSON value of [concurrentCallLimit].
         *
         * Unlike [concurrentCallLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("concurrent_call_limit")
        @ExcludeMissing
        fun _concurrentCallLimit(): JsonField<Long> = concurrentCallLimit

        /**
         * Returns the raw JSON value of [dailySpendLimit].
         *
         * Unlike [dailySpendLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [maxDestinationRate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("max_destination_rate")
        @ExcludeMissing
        fun _maxDestinationRate(): JsonField<Double> = maxDestinationRate

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
         * Returns the raw JSON value of [usagePaymentMethod].
         *
         * Unlike [usagePaymentMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var billingGroupId: JsonField<String> = JsonMissing.of()
            private var callRecording: JsonField<OutboundCallRecording> = JsonMissing.of()
            private var concurrentCallLimit: JsonField<Long> = JsonMissing.of()
            private var dailySpendLimit: JsonField<String> = JsonMissing.of()
            private var dailySpendLimitEnabled: JsonField<Boolean> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var maxDestinationRate: JsonField<Double> = JsonMissing.of()
            private var servicePlan: JsonField<ServicePlan> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var trafficType: JsonField<TrafficType> = JsonMissing.of()
            private var usagePaymentMethod: JsonField<UsagePaymentMethod> = JsonMissing.of()
            private var whitelistedDestinations: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                billingGroupId = body.billingGroupId
                callRecording = body.callRecording
                concurrentCallLimit = body.concurrentCallLimit
                dailySpendLimit = body.dailySpendLimit
                dailySpendLimitEnabled = body.dailySpendLimitEnabled
                enabled = body.enabled
                maxDestinationRate = body.maxDestinationRate
                servicePlan = body.servicePlan
                tags = body.tags.map { it.toMutableList() }
                trafficType = body.trafficType
                usagePaymentMethod = body.usagePaymentMethod
                whitelistedDestinations = body.whitelistedDestinations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A user-supplied name to help with organization. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The ID of the billing group associated with the outbound proflile. Defaults to null
             * (for no group assigned).
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
             * You should usually call [Builder.callRecording] with a well-typed
             * [OutboundCallRecording] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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
             * Alias for calling [Builder.concurrentCallLimit] with
             * `concurrentCallLimit.orElse(null)`.
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

            /**
             * The maximum amount of usage charges, in USD, you want Telnyx to allow on this
             * outbound voice profile in a day before disallowing new calls.
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

            /**
             * Specifies whether to enforce the daily_spend_limit on this outbound voice profile.
             */
            fun dailySpendLimitEnabled(dailySpendLimitEnabled: Boolean) =
                dailySpendLimitEnabled(JsonField.of(dailySpendLimitEnabled))

            /**
             * Sets [Builder.dailySpendLimitEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dailySpendLimitEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dailySpendLimitEnabled(dailySpendLimitEnabled: JsonField<Boolean>) = apply {
                this.dailySpendLimitEnabled = dailySpendLimitEnabled
            }

            /**
             * Specifies whether the outbound voice profile can be used. Disabled profiles will
             * result in outbound calls being blocked for the associated Connections.
             */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /** Setting for how costs for outbound profile are calculated. */
            fun usagePaymentMethod(usagePaymentMethod: UsagePaymentMethod) =
                usagePaymentMethod(JsonField.of(usagePaymentMethod))

            /**
             * Sets [Builder.usagePaymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usagePaymentMethod] with a well-typed
             * [UsagePaymentMethod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun usagePaymentMethod(usagePaymentMethod: JsonField<UsagePaymentMethod>) = apply {
                this.usagePaymentMethod = usagePaymentMethod
            }

            /**
             * The list of destinations you want to be able to call using this outbound voice
             * profile formatted in alpha2.
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    billingGroupId,
                    callRecording,
                    concurrentCallLimit,
                    dailySpendLimit,
                    dailySpendLimitEnabled,
                    enabled,
                    maxDestinationRate,
                    servicePlan,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    trafficType,
                    usagePaymentMethod,
                    (whitelistedDestinations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            billingGroupId()
            callRecording().ifPresent { it.validate() }
            concurrentCallLimit()
            dailySpendLimit()
            dailySpendLimitEnabled()
            enabled()
            maxDestinationRate()
            servicePlan().ifPresent { it.validate() }
            tags()
            trafficType().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (billingGroupId.asKnown().isPresent) 1 else 0) +
                (callRecording.asKnown().getOrNull()?.validity() ?: 0) +
                (if (concurrentCallLimit.asKnown().isPresent) 1 else 0) +
                (if (dailySpendLimit.asKnown().isPresent) 1 else 0) +
                (if (dailySpendLimitEnabled.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (maxDestinationRate.asKnown().isPresent) 1 else 0) +
                (servicePlan.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (trafficType.asKnown().getOrNull()?.validity() ?: 0) +
                (usagePaymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                billingGroupId == other.billingGroupId &&
                callRecording == other.callRecording &&
                concurrentCallLimit == other.concurrentCallLimit &&
                dailySpendLimit == other.dailySpendLimit &&
                dailySpendLimitEnabled == other.dailySpendLimitEnabled &&
                enabled == other.enabled &&
                maxDestinationRate == other.maxDestinationRate &&
                servicePlan == other.servicePlan &&
                tags == other.tags &&
                trafficType == other.trafficType &&
                usagePaymentMethod == other.usagePaymentMethod &&
                whitelistedDestinations == other.whitelistedDestinations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                billingGroupId,
                callRecording,
                concurrentCallLimit,
                dailySpendLimit,
                dailySpendLimitEnabled,
                enabled,
                maxDestinationRate,
                servicePlan,
                tags,
                trafficType,
                usagePaymentMethod,
                whitelistedDestinations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, billingGroupId=$billingGroupId, callRecording=$callRecording, concurrentCallLimit=$concurrentCallLimit, dailySpendLimit=$dailySpendLimit, dailySpendLimitEnabled=$dailySpendLimitEnabled, enabled=$enabled, maxDestinationRate=$maxDestinationRate, servicePlan=$servicePlan, tags=$tags, trafficType=$trafficType, usagePaymentMethod=$usagePaymentMethod, whitelistedDestinations=$whitelistedDestinations, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OutboundVoiceProfileCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OutboundVoiceProfileCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
